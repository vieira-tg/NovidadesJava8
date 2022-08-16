package interfacefuncional;

import java.math.BigDecimal;

@FunctionalInterface
interface Calculadora {
  BigDecimal calcular(BigDecimal x, BigDecimal y);
}
