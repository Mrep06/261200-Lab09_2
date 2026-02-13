package oop.lsp;

// LSP Compliance: Penguin only implements Moveable.
// It is not forced to implement fly(), avoiding UnsupportedOperationExceptions.
public class Ostrich implements Moveable {
    @Override
    public void move() {
        System.out.println("Ostrich runs fast across the savanna.");
    }
    // ไม่มีการ implement fly() เพราะนกกระจอกเทศบินไม่ได้ (เคารพกฎ LSP)
}