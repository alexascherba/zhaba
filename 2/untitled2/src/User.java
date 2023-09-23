public class User {
    private String login, password;
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public class Query {
        public void printToLog() {
            System.out.println("Пользователь " + login + " с паролем " + password + " отправил запрос");
        }
    }
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
}
