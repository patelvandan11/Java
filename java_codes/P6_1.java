public class P6_1 {
    
}
class InvoiceDetail<N extends Number> {
    private String invoiceName;
    private N amount;
    private N discount;

    public InvoiceDetail(String invoiceName, N amount, N discount) {
        this.invoiceName = invoiceName;
        this.amount = amount;
        this.discount = discount;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public N getAmount() {
        return amount;
    }

    public void setAmount(N amount) {
        this.amount = amount;
    }

    public N getDiscount() {
        return discount;
    }

    public void setDiscount(N discount) {
        this.discount = discount;
    }
}

public static void main(String[] args) {
    InvoiceDetail<Double> invoice = new InvoiceDetail<>("Invoice1", 1000.0, 100.0);
    System.out.println("Invoice Name: " + invoice.getInvoiceName());
    System.out.println("Amount: " + invoice.getAmount());
    System.out.println("Discount: " + invoice.getDiscount());
}