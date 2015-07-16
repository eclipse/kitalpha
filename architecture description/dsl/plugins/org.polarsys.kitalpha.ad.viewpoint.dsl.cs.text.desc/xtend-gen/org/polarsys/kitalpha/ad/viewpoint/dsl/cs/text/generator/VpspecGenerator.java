package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.CommonGenerator;

@SuppressWarnings("all")
public class VpspecGenerator extends CommonGenerator {
  public boolean checkInput(final List<EObject> objects) {
    final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject c) {
          return Boolean.valueOf((c instanceof Configuration));
        }
      };
    EObject configuration = IterableExtensions.<EObject>findFirst(objects, _function);
    boolean _equals = Objects.equal(configuration, null);
    if (_equals) {
      return false;
    }
    final Function1<EObject,Boolean> _function_1 = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject c) {
          return Boolean.valueOf((c instanceof Data));
        }
      };
    EObject data = IterableExtensions.<EObject>findFirst(objects, _function_1);
    boolean _equals_1 = Objects.equal(data, null);
    if (_equals_1) {
      return false;
    }
    return true;
  }
}
