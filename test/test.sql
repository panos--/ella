fun get_last_month() {
    import java.util.Calendar;

    var cal := Calendar.instance;
    cal.set(Calendar.MONTH.toInteger(), (cal.get(Calendar.MONTH.toInteger()) - 1).toInteger());
    cal.set(Calendar.DAY_OF_MONTH.toInteger(), cal.getActualMaximum(Calendar.DAY_OF_MONTH.toInteger()).toInteger());

    return cal;
}
