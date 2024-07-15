package pattern;
public class Singleton {
    // Singleton örneği (instance)
    private static Singleton instance;

    // Özel yapılandırıcı (private constructor) - dışarıdan erişim yok
    private Singleton() {
        // Özel yapılandırıcı
    }

    // Singleton örneğini (instance) almak için kullanılan metod
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Singleton örneğinin çalıştığını gösteren metod
    public void showMessage() {
        System.out.println("Singleton Instance: Hello, world!");
    }
}
