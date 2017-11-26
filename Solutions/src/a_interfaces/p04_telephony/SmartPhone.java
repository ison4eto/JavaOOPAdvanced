package a_interfaces.p04_telephony;

public class SmartPhone implements Callable,Browsable {

    private String number;
    private String url;

    @Override
    public void call(String number) {
        try{
            this.setNumber(number);
            System.out.printf("Calling... %s%n", this.number);

        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void browse(String url) {
        try{
            this.setUrl(url);
            System.out.printf("Browsing: %s!%n", this.url);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }

    private void setNumber(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Invalid number!");
            }
        }

        this.number = number;
    }

    private void setUrl(String url) {
        for (char c : url.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("Invalid URL!");
            }
        }
        this.url = url;
    }
}
