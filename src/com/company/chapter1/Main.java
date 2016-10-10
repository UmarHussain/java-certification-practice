package com.company.chapter1;

public class Main {

    InnerMain innerMain = new InnerMain();

    public static void main(String[] args) {

       Main main = new Main();




    }

    class InnerMain {

        public InnerMain(){}

        private String text = "Hello World";

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

}

class NonMain{

    private String text = "Hello World";



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}