package GDSC_4th_HW;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class D {
    private C c;

    public C getC() {
        return c;
    }

    @Autowired
    public D(C c){
        this.c = c;
    }
}
