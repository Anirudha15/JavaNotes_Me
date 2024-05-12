package CollectionAndGenerices.Q97Enum;



public enum Days {
    
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATUARDAY(false),
    SUNDAY(false);

    private final boolean isWeakday;

    Days(boolean isWeakday){
        this.isWeakday = isWeakday;
    }

    public String getType(){
        return isWeakday ? "Weekday" : "weekend";
    }


}
