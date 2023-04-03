 class MyException extends Exception {
    public MyException(String message){
        super(message);

    }
    public static void main(String[] args) {
        try {
            throw new MyException("Возникла ошибка!!!");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

      }
    }
