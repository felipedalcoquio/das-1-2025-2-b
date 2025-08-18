package br.univille.singleton;

public class Singleton {
    // parece uma variável global.
    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    } 
}
