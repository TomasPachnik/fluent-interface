public class Main {

    public static void main(String[] args) {
        Query query = new Query();
        query.select("*").from("employee").where("name").isEqual("Tomas").and("age").isEqual(24);
        System.out.println(query.toString());
    }

}
