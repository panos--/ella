var inc := 'inc/include-file.sql';
.print('including file: @{inc}');
.includeFile(inc);

.print(foo);
