package ru.otus.java.basic.homeworks.homework17;


/** Описание/Пошаговая инструкция выполнения домашнего задания:
 Создайте пул потоков
 Задайте пулу три задачи: первая должна 5 раз напечатать букву A, вторая - B, третья - C
 Синхронизируйте потоки в пуле таким образом, чтобы в любой ситуации в консоль печаталась последовательность ABCABCABCABCABC
 После печати всех символов программа должна завершиться
 */
public class Application {
    private class PrintString {
        private String str = null;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
    private final Object mon = new Object();
    public PrintString printString = new PrintString();

    public static void main(String[] args) {
        Application application = new Application();
        new Thread(() -> application.printA()).start();
        new Thread(() -> application.printB()).start();
        new Thread(() -> application.printC()).start();
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while ((printString.getStr() != null) && (printString.getStr() != "C")) {
                        mon.wait();
                    }
                    printString.setStr("A");
                    System.out.print(printString.getStr());
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (printString.getStr() != "A") {
                        mon.wait();
                    }
                    printString.setStr("B");
                    System.out.print(printString.getStr());
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (printString.getStr() != "B") {
                        mon.wait();
                    }
                    printString.setStr("C");
                    System.out.print(printString.getStr());
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
