var x := false ? 'foo' : fun () { 'bar'; };

.print("x: @{x}");
if (x.call) {
    print('x is callable -> calling');
    var y := x();
    print("result of x: @{y}");
}
