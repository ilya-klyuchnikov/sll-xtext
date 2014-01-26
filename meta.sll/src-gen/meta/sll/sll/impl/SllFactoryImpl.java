/**
 */
package meta.sll.sll.impl;

import meta.sll.sll.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SllFactoryImpl extends EFactoryImpl implements SllFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SllFactory init()
  {
    try
    {
      SllFactory theSllFactory = (SllFactory)EPackage.Registry.INSTANCE.getEFactory(SllPackage.eNS_URI);
      if (theSllFactory != null)
      {
        return theSllFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SllFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SllFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SllPackage.PROGRAM: return createProgram();
      case SllPackage.DEFINITION: return createDefinition();
      case SllPackage.FDEFINITION: return createFDefinition();
      case SllPackage.GDEFINITION: return createGDefinition();
      case SllPackage.PATTERN: return createPattern();
      case SllPackage.EXPRESSION: return createExpression();
      case SllPackage.FCALL: return createFCall();
      case SllPackage.GCALL: return createGCall();
      case SllPackage.CTR: return createCtr();
      case SllPackage.VAR: return createVar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FDefinition createFDefinition()
  {
    FDefinitionImpl fDefinition = new FDefinitionImpl();
    return fDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDefinition createGDefinition()
  {
    GDefinitionImpl gDefinition = new GDefinitionImpl();
    return gDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FCall createFCall()
  {
    FCallImpl fCall = new FCallImpl();
    return fCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GCall createGCall()
  {
    GCallImpl gCall = new GCallImpl();
    return gCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ctr createCtr()
  {
    CtrImpl ctr = new CtrImpl();
    return ctr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SllPackage getSllPackage()
  {
    return (SllPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SllPackage getPackage()
  {
    return SllPackage.eINSTANCE;
  }

} //SllFactoryImpl
