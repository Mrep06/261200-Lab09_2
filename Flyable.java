package oop.lsp;

// LSP Compliance: Flyable extends Moveable because all flying
// birds are also capable of general movement.
public interface Flyable extends Moveable {
    void fly();
}