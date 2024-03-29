/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.scoping;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.example.mydsl.scoping.AbstractTURNScopeProvider;
import org.xtext.example.mydsl.tURN.Actor;
import org.xtext.example.mydsl.tURN.AndJoin;
import org.xtext.example.mydsl.tURN.ComponentRef;
import org.xtext.example.mydsl.tURN.EndPoint;
import org.xtext.example.mydsl.tURN.FailurePoint;
import org.xtext.example.mydsl.tURN.IntentionalElement;
import org.xtext.example.mydsl.tURN.OrJoin;
import org.xtext.example.mydsl.tURN.Path;
import org.xtext.example.mydsl.tURN.PluginBinding;
import org.xtext.example.mydsl.tURN.RespRef;
import org.xtext.example.mydsl.tURN.StartPoint;
import org.xtext.example.mydsl.tURN.Stub;
import org.xtext.example.mydsl.tURN.TURNPackage;
import org.xtext.example.mydsl.tURN.Timer;
import org.xtext.example.mydsl.tURN.UCMmap;
import org.xtext.example.mydsl.tURN.URNspec;
import org.xtext.example.mydsl.tURN.WaitingPlace;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class TURNScopeProvider extends AbstractTURNScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      final EObject rootElement = EcoreUtil2.getRootContainer(context);
      final UCMmap rootMap = EcoreUtil2.<UCMmap>getContainerOfType(context, UCMmap.class);
      boolean _notEquals = (!Objects.equal(rootMap, null));
      if (_notEquals) {
        final List<EndPoint> endPoints = EcoreUtil2.<EndPoint>getAllContentsOfType(rootMap, EndPoint.class);
        final List<RespRef> resps = EcoreUtil2.<RespRef>getAllContentsOfType(rootMap, RespRef.class);
        final List<ComponentRef> components = EcoreUtil2.<ComponentRef>getAllContentsOfType(rootMap, ComponentRef.class);
        final List<StartPoint> startPoints = EcoreUtil2.<StartPoint>getAllContentsOfType(rootMap, StartPoint.class);
        final List<Stub> stubs = EcoreUtil2.<Stub>getAllContentsOfType(rootMap, Stub.class);
        final PluginBinding rootStub = EcoreUtil2.<PluginBinding>getContainerOfType(context, PluginBinding.class);
        boolean _notEquals_1 = (!Objects.equal(rootStub, null));
        if (_notEquals_1) {
          EReference _outBinding_MapEnd = TURNPackage.eINSTANCE.getOutBinding_MapEnd();
          boolean _equals = Objects.equal(reference, _outBinding_MapEnd);
          if (_equals) {
            final List<EObject> pbs1 = EcoreUtil2.getAllReferencedObjects(rootStub, TURNPackage.eINSTANCE.getPluginBinding_Map());
            final List<EndPoint> eps1 = EcoreUtil2.<EndPoint>getAllContentsOfType(pbs1.get(0), EndPoint.class);
            final Function<EndPoint, QualifiedName> _function = (EndPoint e) -> {
              return QualifiedName.create(e.getName());
            };
            return Scopes.<EndPoint>scopeFor(eps1, _function, IScope.NULLSCOPE);
          }
          EReference _inBinding_MapStart = TURNPackage.eINSTANCE.getInBinding_MapStart();
          boolean _equals_1 = Objects.equal(reference, _inBinding_MapStart);
          if (_equals_1) {
            final List<EObject> pbs1_1 = EcoreUtil2.getAllReferencedObjects(rootStub, TURNPackage.eINSTANCE.getPluginBinding_Map());
            final List<StartPoint> sps1 = EcoreUtil2.<StartPoint>getAllContentsOfType(pbs1_1.get(0), StartPoint.class);
            final Function<StartPoint, QualifiedName> _function_1 = (StartPoint e) -> {
              return QualifiedName.create(e.getName());
            };
            return Scopes.<StartPoint>scopeFor(sps1, _function_1, IScope.NULLSCOPE);
          }
        }
        EReference _boundElement_Elem = TURNPackage.eINSTANCE.getBoundElement_Elem();
        boolean _equals_2 = Objects.equal(reference, _boundElement_Elem);
        if (_equals_2) {
          final Function<StartPoint, QualifiedName> _function_2 = (StartPoint e) -> {
            return QualifiedName.create(e.getName());
          };
          final Function<RespRef, QualifiedName> _function_3 = (RespRef e) -> {
            return QualifiedName.create(e.getName());
          };
          final Function<ComponentRef, QualifiedName> _function_4 = (ComponentRef e) -> {
            return QualifiedName.create(e.getName());
          };
          final Function<Stub, QualifiedName> _function_5 = (Stub e) -> {
            return QualifiedName.create(e.getName());
          };
          final Function<EndPoint, QualifiedName> _function_6 = (EndPoint e) -> {
            return QualifiedName.create(e.getName());
          };
          return Scopes.<StartPoint>scopeFor(startPoints, _function_2, Scopes.<RespRef>scopeFor(resps, _function_3, Scopes.<ComponentRef>scopeFor(components, _function_4, Scopes.<Stub>scopeFor(stubs, _function_5, Scopes.<EndPoint>scopeFor(endPoints, _function_6, IScope.NULLSCOPE)))));
        }
        EReference _pathBody_ReferencedEnd = TURNPackage.eINSTANCE.getPathBody_ReferencedEnd();
        boolean _equals_3 = Objects.equal(reference, _pathBody_ReferencedEnd);
        if (_equals_3) {
          final Path cPath = EcoreUtil2.<Path>getContainerOfType(context, Path.class);
          final UCMmap map = EcoreUtil2.<UCMmap>getContainerOfType(context, UCMmap.class);
          final List<OrJoin> allOrJoins = EcoreUtil2.<OrJoin>getAllContentsOfType(map, OrJoin.class);
          final List<AndJoin> andJoins = EcoreUtil2.<AndJoin>getAllContentsOfType(map, AndJoin.class);
          final List<Timer> timers = EcoreUtil2.<Timer>getAllContentsOfType(map, Timer.class);
          final List<FailurePoint> failurePoints = EcoreUtil2.<FailurePoint>getAllContentsOfType(map, FailurePoint.class);
          final Function<OrJoin, QualifiedName> _function_7 = (OrJoin j) -> {
            final Path jsPath = EcoreUtil2.<Path>getContainerOfType(j, Path.class);
            final UCMmap jsMap = EcoreUtil2.<UCMmap>getContainerOfType(j, UCMmap.class);
            if (((jsPath == cPath) || Objects.equal(jsMap, map))) {
              return QualifiedName.create(j.getName());
            }
            return QualifiedName.create(map.getName()).append(QualifiedName.create(j.getName()));
          };
          final Function<RespRef, QualifiedName> _function_8 = (RespRef r) -> {
            final Path rsPath = EcoreUtil2.<Path>getContainerOfType(r, Path.class);
            final UCMmap rsMap = EcoreUtil2.<UCMmap>getContainerOfType(r, UCMmap.class);
            if (((rsPath == cPath) || Objects.equal(rsMap, map))) {
              return QualifiedName.create(r.getName());
            }
            return QualifiedName.create(map.getName()).append(QualifiedName.create(r.getName()));
          };
          final Function<AndJoin, QualifiedName> _function_9 = (AndJoin aj) -> {
            final Path jsPath = EcoreUtil2.<Path>getContainerOfType(aj, Path.class);
            final UCMmap jsMap = EcoreUtil2.<UCMmap>getContainerOfType(aj, UCMmap.class);
            if (((jsPath == cPath) || Objects.equal(jsMap, map))) {
              return QualifiedName.create(aj.getName());
            }
            return QualifiedName.create(map.getName()).append(QualifiedName.create(aj.getName()));
          };
          final Function<Timer, QualifiedName> _function_10 = (Timer t) -> {
            final Path tsPath = EcoreUtil2.<Path>getContainerOfType(t, Path.class);
            final UCMmap tsMap = EcoreUtil2.<UCMmap>getContainerOfType(t, UCMmap.class);
            if ((((tsPath == cPath) || Objects.equal(tsMap, map)) && (t.getName() != null))) {
              return QualifiedName.create(t.getName());
            }
            String _name = t.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              return QualifiedName.create(map.getName()).append(QualifiedName.create(t.getName()));
            }
            return null;
          };
          final Function<FailurePoint, QualifiedName> _function_11 = (FailurePoint fps) -> {
            final Path fpsPath = EcoreUtil2.<Path>getContainerOfType(fps, Path.class);
            final UCMmap fpsMap = EcoreUtil2.<UCMmap>getContainerOfType(fps, UCMmap.class);
            if ((((fpsPath == cPath) || Objects.equal(fpsMap, map)) && (fps.getName() != null))) {
              return QualifiedName.create(fps.getName());
            }
            String _name = fps.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              return QualifiedName.create(map.getName()).append(QualifiedName.create(fps.getName()));
            }
            return null;
          };
          return Scopes.<OrJoin>scopeFor(allOrJoins, _function_7, Scopes.<RespRef>scopeFor(resps, _function_8, Scopes.<AndJoin>scopeFor(andJoins, _function_9, Scopes.<Timer>scopeFor(timers, _function_10, Scopes.<FailurePoint>scopeFor(failurePoints, _function_11, IScope.NULLSCOPE)))));
        }
        EReference _connect_ConnectsTo = TURNPackage.eINSTANCE.getConnect_ConnectsTo();
        boolean _equals_4 = Objects.equal(reference, _connect_ConnectsTo);
        if (_equals_4) {
          final Path cPath_1 = EcoreUtil2.<Path>getContainerOfType(context, Path.class);
          final UCMmap map_1 = EcoreUtil2.<UCMmap>getContainerOfType(context, UCMmap.class);
          final List<StartPoint> startPts = EcoreUtil2.<StartPoint>getAllContentsOfType(map_1, StartPoint.class);
          final List<WaitingPlace> wps = EcoreUtil2.<WaitingPlace>getAllContentsOfType(map_1, WaitingPlace.class);
          final List<Timer> timers_1 = EcoreUtil2.<Timer>getAllContentsOfType(map_1, Timer.class);
          final Function<StartPoint, QualifiedName> _function_12 = (StartPoint sp) -> {
            final Path spPath = EcoreUtil2.<Path>getContainerOfType(sp, Path.class);
            final UCMmap spMap = EcoreUtil2.<UCMmap>getContainerOfType(sp, UCMmap.class);
            if (((spPath == cPath_1) || Objects.equal(spMap, map_1))) {
              return QualifiedName.create(sp.getName());
            }
            return QualifiedName.create(map_1.getName()).append(QualifiedName.create(sp.getName()));
          };
          final Function<WaitingPlace, QualifiedName> _function_13 = (WaitingPlace wp) -> {
            final Path wpPath = EcoreUtil2.<Path>getContainerOfType(wp, Path.class);
            final UCMmap wpMap = EcoreUtil2.<UCMmap>getContainerOfType(wp, UCMmap.class);
            if (((wpPath == cPath_1) || Objects.equal(wpMap, map_1))) {
              String _name = wp.getName();
              boolean _tripleNotEquals = (_name != null);
              if (_tripleNotEquals) {
                return QualifiedName.create(wp.getName());
              }
            }
            String _name_1 = wp.getName();
            boolean _tripleNotEquals_1 = (_name_1 != null);
            if (_tripleNotEquals_1) {
              return QualifiedName.create(map_1.getName()).append(QualifiedName.create(wp.getName()));
            }
            return null;
          };
          final Function<Timer, QualifiedName> _function_14 = (Timer t) -> {
            final Path tsPath = EcoreUtil2.<Path>getContainerOfType(t, Path.class);
            final UCMmap tsMap = EcoreUtil2.<UCMmap>getContainerOfType(t, UCMmap.class);
            if ((((tsPath == cPath_1) || Objects.equal(tsMap, map_1)) && (t.getName() != null))) {
              return QualifiedName.create(t.getName());
            }
            String _name = t.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              return QualifiedName.create(map_1.getName()).append(QualifiedName.create(t.getName()));
            }
            return null;
          };
          return Scopes.<StartPoint>scopeFor(startPts, _function_12, Scopes.<WaitingPlace>scopeFor(wps, _function_13, Scopes.<Timer>scopeFor(timers_1, _function_14, IScope.NULLSCOPE)));
        }
        EReference _pathBody_ReferencedStub = TURNPackage.eINSTANCE.getPathBody_ReferencedStub();
        boolean _equals_5 = Objects.equal(reference, _pathBody_ReferencedStub);
        if (_equals_5) {
          final Path cPath_2 = EcoreUtil2.<Path>getContainerOfType(context, Path.class);
          final UCMmap map_2 = EcoreUtil2.<UCMmap>getContainerOfType(context, UCMmap.class);
          final List<Stub> refstubs = EcoreUtil2.<Stub>getAllContentsOfType(map_2, Stub.class);
          final Function<Stub, QualifiedName> _function_15 = (Stub s) -> {
            final Path sPath = EcoreUtil2.<Path>getContainerOfType(s, Path.class);
            final UCMmap sMap = EcoreUtil2.<UCMmap>getContainerOfType(s, UCMmap.class);
            if ((((sPath == cPath_2) || Objects.equal(sMap, map_2)) && (s.getName() != null))) {
              return QualifiedName.create(s.getName());
            }
            String _name = s.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              return QualifiedName.create(map_2.getName()).append(QualifiedName.create(s.getName()));
            }
            return null;
          };
          return Scopes.<Stub>scopeFor(refstubs, _function_15, IScope.NULLSCOPE);
        }
      }
      if ((((reference == TURNPackage.eINSTANCE.getContribution_Dest()) || (reference == TURNPackage.eINSTANCE.getDecomposition_Dest())) || (reference == TURNPackage.eINSTANCE.getDependency_Dest()))) {
        final Actor cActor = EcoreUtil2.<Actor>getContainerOfType(context, Actor.class);
        final URNspec spec = EcoreUtil2.<URNspec>getContainerOfType(context, URNspec.class);
        final List<IntentionalElement> allIntElems = EcoreUtil2.<IntentionalElement>getAllContentsOfType(spec, IntentionalElement.class);
        final Function<IntentionalElement, QualifiedName> _function_16 = (IntentionalElement im) -> {
          final Actor esActor = EcoreUtil2.<Actor>getContainerOfType(im, Actor.class);
          String _name = esActor.getName();
          String _name_1 = cActor.getName();
          boolean _tripleEquals = (_name == _name_1);
          if (_tripleEquals) {
            return QualifiedName.create(im.getName());
          }
          return QualifiedName.create(esActor.getName()).append(QualifiedName.create(im.getName()));
        };
        return Scopes.<IntentionalElement>scopeFor(allIntElems, _function_16, IScope.NULLSCOPE);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
}
