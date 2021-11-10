package pl.twojedrzwidoit.advanced.domain;

public class Order {

    String userId;
    String id;
    String from;
    String to;
    String status;
    String statusMessage;

    public Order(String userId, String id, String from, String to, String status, String statusMessage) {
        this.userId = userId;
        this.id = id;
        this.from = from;
        this.to = to;
        this.status = status;
        this.statusMessage = statusMessage;
    }
}
