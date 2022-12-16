package com.codegym.injection.constructor;

public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {//cốt lõi là ở đây - giống Indian tiêm Connection trong class XXXDao
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
