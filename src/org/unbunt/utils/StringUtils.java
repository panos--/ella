package org.unbunt.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

/**
 * User: tweiss
 * Date: 13.02.2007
 * Time: 11:32:14
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class StringUtils {
    private static Log logger = LogFactory.getLog(StringUtils.class);

    public static final String URL_DELIM_PARAM = "&";
    public static final String URL_DELIM_VALUE = "=";

    public static final String URL_ENCODING = "UTF-8";

    private StringUtils() {
    }

    public static String join2(String joiner, String lastJoiner, Object... elems) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < elems.length; i++) {
            if (i > 0) {
                result.append(i == elems.length - 1 ? lastJoiner : joiner);
            }
            result.append(elems[i]);
        }

        return result.toString();
    }

    public static String join(Object... elems) {
        return join2(", ", ", ", elems);
    }

    public static String join(String joiner, Object... elems) {
        return join2(joiner, joiner, elems);
    }

    public static String joinOr(Object... elems) {
        return join2(", ", " or ", elems);
    }

    public static String joinOr(String... elems) {
        return joinOr((Object[]) elems);
    }

    public static String joinAnd(Object... elems) {
        return join2(", ", " and ", elems);
    }

    public static String joinAnd(String... elems) {
        return joinAnd((Object[]) elems);
    }

    public static String joinList2(String joiner, String lastJoiner, List elems) {
        StringBuffer result = new StringBuffer();

        int nelems = elems.size();
        for (int i = 0; i < nelems; i++) {
            if (i > 0) {
                result.append(i == nelems - 1 ? lastJoiner : joiner);
            }
            result.append(elems.get(i));
        }

        return result.toString();
    }

    public static String joinList(List elems) {
        return joinList2(", ", ", ", elems);
    }

    public static String joinList(String joiner, List elems) {
        return joinList2(joiner, joiner, elems);
    }

    public static String joinListOr(List elems) {
        return joinList2(", ", " or ", elems);
    }

    public static String joinListAnd(List elems) {
        return joinList2(", ", " and ", elems);
    }

    public static Map<String, String> decodeQueryString(String query) {
        assert query != null : "query must not be null";

        Map<String, String> result = new HashMap<String, String>();

        while (query.startsWith("?") || query.startsWith("&")) {
            if (query.length() == 1) {
                query = "";
                break;
            }

            query = query.substring(1);
        }

        while (query.endsWith("&")) {
            if (query.length() == 1) {
                query = "";
                break;
            }

            query = query.substring(0, query.length() - 2);
        }

        if (query.length() == 0) return result;

        String[] params = query.split("&");
        for (String param : params) {
            if (param.length() == 0) continue;

            int valDelimIdx = param.indexOf(URL_DELIM_VALUE);

            if (valDelimIdx == -1) {
                result.put(urldecode(param), "");
                continue;
            }

            String key = valDelimIdx == 0 ? "" : urldecode(param.substring(0, valDelimIdx));
            String val = valDelimIdx + 1 >= param.length() ? "" : urldecode(param.substring(valDelimIdx + 1));

            result.put(key, val);
        }

        return result;
    }

    public static String encodeQueryString(Map<String, String> query) {
        assert query != null : "query must not be null";

        boolean start = true;
        StringBuilder buf = new StringBuilder();

        for (Map.Entry<String,String> entry : query.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            if (val == null) val = "";

            if (start) start = false;
            else buf.append(URL_DELIM_PARAM);

            buf.append(urlencode(key))
                    .append(URL_DELIM_VALUE)
                    .append(urlencode(val));
        }

        return buf.toString();
    }

    public static String urldecode(String s) {
        try {
            return URLDecoder.decode(s, URL_ENCODING);
        } catch (UnsupportedEncodingException e) {
            logger.error("URLDecoder threw exception: " + e.getMessage(), e);
            throw new RuntimeException("URLDecoder threw exception: " + e.getMessage(), e);
        }
    }

    public static String urlencode(String s) {
        try {
            return URLEncoder.encode(s, URL_ENCODING);
        } catch (UnsupportedEncodingException e) {
            logger.error("URLDecoder threw exception: " + e.getMessage(), e);
            throw new RuntimeException("URLDecoder threw exception: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        System.out.println("joinListOr(\"foo\", \"bar\", \"foobar\"):");
        System.out.println(joinOr("foo", "bar", "foobar"));
        System.out.println("");
        System.out.println("decodeQueryString(\"\"):");
        System.out.println(decodeQueryString(""));
        System.out.println("decodeQueryString(\"????foo=bar&foobar&&&&\"):");
        System.out.println(decodeQueryString("????foo=bar&foobar&&&&"));
        System.out.println("decodeQueryString(\"foo=bar&foo=qux&&=&foo=&&&foo=\"):");
        System.out.println(decodeQueryString("foo=bar&foo=qux&&=&foo=&&&foo="));
        System.out.println("decodeQueryString(\"fo%20o=q+ux\"):");
        System.out.println(decodeQueryString("fo%20o=q+ux"));
        System.out.println("");
        Map<String, String> params = new HashMap<String, String>();
        params.put("foo bar", "bla blubb");
        params.put("foo?foo", "bla&bla");
        System.out.println("encodeQueryString(" + params + ")");
        System.out.println(encodeQueryString(params));
        /*String s1 = "C:\\Dokumente und Einstellungen\\mbarth\\IdeaProjects\\ContentRepository\\repositories\\leonardo\\StagingArea\\Mediaplanung\\Italy\\2007\\Chrysler Group\\Jeep\\mediaplan-JEEP-GRANDCHEROKEE.xls";
        String s2 =  "C:\\Dokumente und Einstellungen\\mbarth\\IdeaProjects\\ContentRepository\\repositories\\leonardo\\StagingArea\\Mediaplanung\\Italy\\2007\\Chrysler Group\\Jeep\\.chkin54633.repository-temp";
        File temp = new File(s1);
        if (temp.exists()) {
            temp.renameTo(new File(s2));
        }   */

        System.out.println("res:" + Double.NaN);
    }

    public static List<String> commaListToCollection(String list) {

        String[] splitted = list.split(",");
        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = splitted[i].trim();
        }
        //List<String> mresult = Arrays.asList(splitted);

        return Arrays.asList(splitted);

//        List<String> result = new ArrayList<String>();
//        StringTokenizer st = new StringTokenizer(list, ",", false);
//        while (st.hasMoreElements())
//            result.add(((String) st.nextElement()).trim());
//
//        return result;
    }

    public static String arrayToCommaList(boolean quote, String... array) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            if (i > 0) {
                result.append(", ");
            }

            if (quote) {
                result.append(asQuotedString(array[i]));
            } else {
                result.append(array[i]);

            }
        }

        return result.toString();
    }

    public static String arrayToCommaList(String[] array) {
        return arrayToCommaList(true, array);
    }

    public static String stringListToCommaList(List<String> values) {
        return stringListToCommaList(values, false);
    }

    public static String stringListToCommaList(List<String> values, boolean quote) {
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(quote ? asQuotedString(value) : value);
        }
        return sb.toString();
    }

    public static String escapeJS(String origP) {
        String newP = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < origP.length(); i++) {
            if (origP.charAt(i) == '\'') {
                newP = newP + '\\';
                sb.append('\\');
            }
            sb.append(origP.charAt(i));
            newP = newP + origP.charAt(i);
        }
        //return newP;
        return sb.toString();
    }

    public static String escapeXML(String origP) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < origP.length(); i++) {
            String newP = null;
            char charAtPos = origP.charAt(i);
            if (origP.charAt(i) == '\'') newP = "&amp;apos;";
            else if (charAtPos == 'ö') newP = "&ouml;";
            else if (charAtPos == 'Ö') newP = "&Ouml;";
            else if (charAtPos == 'ä') newP = "&auml;";
            else if (charAtPos == 'Ä') newP = "&Auml;";
            else if (charAtPos == 'ü') newP = "&uuml;";
            else if (charAtPos == 'Ü') newP = "&Uuml;";
            else if (charAtPos == 'ß') newP = "&szlig;";

            if (newP == null) {
                sb.append(newP);
            } else {
                sb.append(charAtPos);
            }
        }

        return sb.toString();

    }

    public static String asQuotedString(String aString) {
        if (aString == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        for (int i = 0; i < aString.length(); i++) {
            if (aString.charAt(i) != '\'') {
                sb.append(aString.charAt(i));
            }
        }
        sb.append('\'');

        return sb.toString();
    }

    public static int indexOf(Object o, Object... oa) {
        for (int i = 0; i < oa.length; i++) {
            if (oa[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public static String unQuotedString(String aString) {
        return unQuotedString(aString, false);
    }

    public static String unQuotedString(String aString, boolean trim) {
        if (trim) {
            aString = aString.trim();
        }
        if (aString.startsWith("'")) {
            aString = aString.substring(1);
        }
        if (aString.endsWith("'")) {
            aString = aString.substring(0, aString.length() - 1);
        }
        return aString;
    }

    public static String toUnquotedString(String[] strings) {
        StringBuilder sbb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            if (i > 0) {
                sbb.append(", ");
            }
            sbb.append(unQuotedString(strings[i]));

        }
        return sbb.toString();
    }

    public static String[] toUnQuotedStringArray(String[] strings) {
        if (strings == null) {
            return new String[0];
        }
        String[] quotedStrings = new String[strings.length];

        for (int i = 0; i < quotedStrings.length; i++) {
            quotedStrings[i] = unQuotedString(strings[i]);
        }
        return quotedStrings;
    }

    public static int occurencesOf(char aChar, String aString) {
        int occ = 0;
        for (int i = 0; i < aString.length(); i++) {
            if (aString.charAt(i) == aChar) {
                occ++;
            }
        }
        return occ;
    }

    public static boolean isNullOrEmpty(String obj) {
        return obj == null || obj.trim().length() == 0;
    }

    public static String quotedArrayValuesString(String listString) {
        String[] spliz;

        spliz = listString.split(", ");

        String[] quotedSplit = new String[spliz.length];

        for (int i = 0; i < spliz.length; i++) {
            quotedSplit[i] = StringUtils.asQuotedString(spliz[i]);
        }
        return Arrays.toString(quotedSplit);
    }

    public static String[] toQuotedStringArray(String[] strings) {
        String[] quotedStrings = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            quotedStrings[i] = asQuotedString(strings[i]);
        }
        return quotedStrings;
    }

    public static String[] toQuotedStringArray(List<String> strings) {
        String[] quotedStrings = new String[strings.size()];

        for (int i = 0; i < quotedStrings.length; i++) {
            quotedStrings[i] = asQuotedString(strings.get(i));
        }
        return quotedStrings;
    }

    public static String toQuotedString(List<String> strings) {

        return Arrays.toString(toQuotedStringArray(strings));

    }

    public static String toQuotedString(String[] strings) {
        String[] toQuote = toQuotedStringArray(strings);
        String checkResult = Arrays.toString(toQuote);
        return checkResult;
    }

    public static String toLowerCase(String aString) {
        if (aString == null) {
            return null;
        }
        return aString.toLowerCase();
    }

    public static String last(String[] values) {
        if (values.length == 0) {
            return null;
        }
        return values[values.length - 1];
    }

    public static String[] copyUpToIndex(String[] values, int idx) {
        String[] result = new String[idx + 1];
        System.arraycopy(values, 0, result, 0, idx + 1);
        return result;
    }

    /**
     * Sind die beiden Stringarrays bis zu einem gewissen Punkt gleich?
     *
     * @param values1
     * @param values2
     * @param idx     - bis hier hin
     * @return boolean
     */
    public static boolean equals(String[] values1, String[] values2, int idx) {
        for (int i = idx; i >= 0; i--) {
            if (!values1[i].equals(values2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsBut(String[] values1, String[] values2, int idx) {
        for (int i = 0; i < values1.length; i++) {
            if (i != idx && !values1[i].equals(values2[i])) {
                return false;
            }
        }
        return true;
    }

    public static int numberOfDifferences(String[] values1, String[] values2) {
        int nod = 0;
        for (int i = 0; i < values1.length; i++) {
            if (!values1[i].equals(values2[i])) {
                nod++;
            }
        }
        return nod;
    }

    public static int indexOfFirstDifference(String[] values1, String[] values2) {
        for (int i = 0; i < values1.length; i++) {
            if (!values1[i].equals(values2[i])) {
                return i;
            }
        }
        // beide Arrays sind gleich
        return -1;
    }

    public static List<Integer> getDifferenceIndices(String[] values1, String[] values2) {
        List<Integer> diffs = new ArrayList<Integer>();
        for (int i = 0; i < values1.length; i++) {
            if (!values1[i].equals(values2[i])) {
                diffs.add(i);
            }
        }
        return diffs;
    }

    public static void appendAspect(String aspect, StringBuilder routine) {
        appendAspect(aspect, routine, true);
    }

    public static void appendAspect(String aspect, StringBuilder routine, boolean useQuotes) {
        appendAspect(aspect, routine, useQuotes, true);
    }

    public static void appendAspect(String aspect, StringBuilder routine, boolean useQuotes, boolean appendSeparator) {

        if (aspect != null && useQuotes) {
            aspect = asQuotedString(aspect);
        }
        routine.append(aspect);
        if (appendSeparator) {
            routine.append(", ");
        }
    }

    public static void appendBooleanAspect(boolean aspect, StringBuilder routine) {
        appendAspect(Boolean.toString(aspect), routine, false, true);
    }

    public static void appendBooleanAspect(boolean aspect, StringBuilder routine, boolean appendSeparator) {
        appendAspect(Boolean.toString(aspect), routine, false, appendSeparator);
    }

    public static String trimFirstAndLastFrom(String aString) {
        if (aString.length() < 3) {
            return "";
        }
        return aString.substring(1, aString.length() - 1);
    }

    public static String escapeColumnName(String columnName) {
        if (columnName.startsWith("'") || columnName.indexOf('(') > 0) {
            return columnName;
        }
//        return '`' + columnName + '`';
        return columnName;
    }

    public static String[] moveValueAtTo(String[] strings, int sourceIndex, int destinationIndex) {

        if (sourceIndex == destinationIndex) {
            return strings;
        }

        String[] target = new String[strings.length];
        if (destinationIndex > 0) {
            System.arraycopy(strings, 0, target, 0, destinationIndex);
        }
        target[destinationIndex] = strings[sourceIndex];
        if (destinationIndex < strings.length - 1) {
            System.arraycopy(strings, destinationIndex, target, destinationIndex + 1, sourceIndex);
        }
        return target;
    }

    public static String propertyArray(Map<String, String> mappedValues) {
        StringBuilder arb = new StringBuilder();
        arb.append("{");
        int i = 0;
        for (Map.Entry<String, String> mapEntry : mappedValues.entrySet()) {
            if (i != 0) {
                arb.append(", ");
            }
            arb.append(mapEntry.getKey());
            arb.append(":");

            arb.append(mapEntry.getValue());
            i++;
        }

        arb.append("}");
        return arb.toString();
    }

    public static String[] toStringArray(Object[] objects) {
        String[] result = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
            result[i] = object == null ? null : object.toString();
        }
        return result;
    }

    public static List<String> filterEmpty(List<String> strings) {
        List<String> result = new ArrayList<String>();
        for (String s : strings) {
            if (isNullOrEmpty(s)) {
                continue;
            }
            result.add(s);
        }
        return result;
    }

    public static int compare(String s1, String s2) {
        if (s1 == null) {
            return s2 == null ? 0 : -1;
        }

        return s2 == null ? 1 : s1.compareTo(s2);
    }

    public static boolean equalsRespectCase(String s1, String s2) {
        return (s1 == null && s2 == null) || (s1 != null && s1.equals(s2));
    }

    public static boolean equalsIgnoreCase(String s1, String s2) {
        return (s1 == null && s2 == null) || (s1 != null && s1.equalsIgnoreCase(s2));
    }

    public static String truncate(String s, int len, String suffix) {
        int slen = s.length();
        if (slen <= len) {
            return s;
        }

        return s.substring(0, len - suffix.length()) + suffix;
    }

    public static String truncate(String s, int len) {
        return truncate(s, len, "...");
    }

    public static String stripNewlines(String s) {
        return s.replaceAll("[\r\n]", "");
    }

    public static String newlinesToSpace(String s) {
        return s.replaceAll("[\r\n]+", " ");
    }
}
