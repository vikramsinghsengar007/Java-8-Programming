import java.io.Serializable;

class Singleton implements Serializable, Cloneable{
    private static Singleton singleton;

    private Singleton(){};

    public Object clone(){
        return singleton;
    }

    public Object readObject(){
        return singleton;
    }


    public static Singleton getInstance(){
        synchronized(Singleton.class){
            if(singleton == null){
                return new Singleton();
            }else{
                return singleton;
            }

        }

    }
}