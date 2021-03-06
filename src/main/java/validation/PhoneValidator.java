package validation;

import com.jfoenix.validation.base.ValidatorBase;
import javafx.scene.control.TextInputControl;

public class PhoneValidator extends ValidatorBase {

    @Override
    protected void eval(){
        if(srcControl.get() instanceof TextInputControl){
            evalTextInputField();
        }
    }

    private void evalTextInputField(){
        TextInputControl textField = (TextInputControl) srcControl.get();

        if(textField.getText().matches("[\\d| ]+")){
           hasErrors.set(false);
        }
        else{
            hasErrors.set(true);
        }
    }
}
