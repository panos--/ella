package org.unbunt.utils;

import org.unbunt.utils.InvalidFileNameException;
import org.unbunt.utils.InvalidPathException;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: panos
 * Date: 01.01.2007
 * Time: 14:38:22
 * To change this template use File | Settings | File Templates.
 */
public abstract class PathUtil {
    public static final String LOCKFILE_EXT = ".repository-lock";
    public static final String TEMPFILE_EXT = ".repository-temp";

    public static final String HISTORY_DIRNAME  = ".history";
    public static final String LOCKFILE_DIRNAME = ".lock";
    public static final String TRASH_DIRNAME    = ".trash";

    public static final String[] RESTRICTED_FILENAMES = { HISTORY_DIRNAME, LOCKFILE_DIRNAME };
    public static final String[] RESTRICTED_SUFFIXES  = { LOCKFILE_EXT, TEMPFILE_EXT };

    protected PathUtil() {
    }

    public abstract String getSeparator();

    public abstract String toRepositoryPath(String path);
    public abstract String toFileSystemPath(String path);

    public boolean validFileName(String name) {
        try {
            validateFileName(name);
            return true;
        } catch (InvalidFileNameException e) {
            return false;
        }
    }

    public void validateFileName(String name) throws InvalidFileNameException {
        if (name.equals(""))
            throw new InvalidFileNameException(name, "File name is empty");

        if (name.equals(".."))
            throw new InvalidFileNameException(name, "Reserved file name: '..'");

        if (name.indexOf(getSeparator()) != -1)
            throw new InvalidFileNameException(name, "Contains directory separator character: " + getSeparator());

        for (String restrictedFilename : RESTRICTED_FILENAMES) {
            if (name.equals(restrictedFilename))
                throw new InvalidFileNameException(name, "Reserved file name: " + restrictedFilename);
        }

        for (String restrictedSuffix : RESTRICTED_SUFFIXES) {
            if (name.endsWith(restrictedSuffix))
                throw new InvalidFileNameException(name, "Has reserved file name suffix: " + restrictedSuffix);
        }
    }

    public boolean validPath(String path) {
        if (path.equals(getSeparator()))
            return true;

        List<String> components = extractComponents(path);
        if (components.size() == 0)
            return false;

        for (String comp : components) {
            if (!validFileName(comp))
                return false;
        }

        return true;
    }

    public void validatePath(String path) throws InvalidPathException {
        if (!validPath(path))
            throw new InvalidPathException();
    }

    public boolean isAbsPath(String path) {
        return path.startsWith(getSeparator());
    }

    public boolean validAbsPath(String path) {
        if (!path.startsWith(getSeparator()))
            return false;
        return validPath(path);
    }

    public void validateAbsPath(String path) throws InvalidPathException {
        if (!validAbsPath(path))
            throw new InvalidPathException();
    }

    public boolean isRelPath(String path) {
        return !path.startsWith(getSeparator());
    }

    public boolean validRelPath(String path) {
        if (path.startsWith(getSeparator()))
            return false;
        return validPath(path);
    }

    public void validateRelPath(String path) throws InvalidPathException {
        if (!validRelPath(path))
            throw new InvalidPathException();
    }

    public String concatPaths(String path, String... paths) {
        String result = path;
        for (String p : paths) {
            result = concatPaths(result, p);
        }
        return result;
    }

    public String concatPaths(String path1, String path2) {
        String sep = getSeparator();

        // nothing to do..
        if (path2 == null || path2.length() == 0 || path2.equalsIgnoreCase(sep))
            return path1;

        int sepl   = sep.length();
        while (path1.endsWith(sep))
            path1 = path1.substring(0, path1.length() - sepl);
        while (path2.startsWith(getSeparator()))
            path2 = path2.substring(sepl);
        return path1 + sep + path2;
    }

    public String absolutizePath(String base, String path) {
        return isAbsPath(path) ? path : concatPaths(base, path);
    }

    public String extractDirectory(String path) {
        int idx = path.lastIndexOf(getSeparator());
        if (idx == -1)
            return "";
        if (idx == 0)
            return getSeparator();
        return path.substring(0, idx);
    }

    public String extractBasename(String path) {
        int idx = path.lastIndexOf(getSeparator());
        if (idx == -1)
            return path;
        return path.substring(idx + 1);
    }

    public String extractExtension(String path) {
        int idx = path.lastIndexOf(".");
        if (idx == -1)
            return "";
        return path.substring(idx + 1);
    }

    public List<String> extractComponents(String path) {
        List<String> result = new ArrayList<String>();
        StringTokenizer tok = new StringTokenizer(path, getSeparator());
        while (tok.hasMoreTokens()) {
            result.add(tok.nextToken());
        }
        return result;
    }

    public String appendSeparator(String path) {
        String sep = getSeparator();
        if (path.endsWith(sep))
            return path;
        return path + sep;
    }

    public boolean containsSeparator(String path) {
        return path.contains(getSeparator());
    }

    public String sanitizePath(String path) {
        if (path.length() == 0)
                return path;

        // TODO: remove occurrances of doubled separators and relative path portions such as '../'

        // remove trailing path separators
        path = path.replaceAll(Pattern.quote(getSeparator()) + "+$", "");

        if (path.length() == 0)
            return "/";

        return path;
    }
}
