public class ProductSession implements Session {
    private String date;
    private String startHour;
    private String endHour;
    private String title;
    private String productType;
    private int numberOfProducts;
    private Calendar calendar;

    public ProductSession(String date, String startHour, String endHour, String title, String productType, int numberOfProducts) {
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
        this.title = title;
        this.productType = productType;
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getStartHour() {
        return startHour;
    }

    @Override
    public String getEndHour() {
        return endHour;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getProductType() {
        return productType;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void addToCalendar() {
        if (calendar != null) {
            calendar.addSession(this);
            System.out.println(
                    "Product Session{" +
                            "Date=" + date +
                            ", Start Hour=" + startHour +
                            ", End Hour=" + endHour +
                            ", Title=" + title +
                            ", Product Type=" + productType +
                            ", Number of Products=" + numberOfProducts +
                            "}");
        } else {
            System.out.println("No calendar assigned for this session.");
        }
    }
}