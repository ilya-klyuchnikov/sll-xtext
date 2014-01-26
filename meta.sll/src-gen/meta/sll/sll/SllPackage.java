/**
 */
package meta.sll.sll;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see meta.sll.sll.SllFactory
 * @model kind="package"
 * @generated
 */
public interface SllPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sll";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sll.meta/SLL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sll";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SllPackage eINSTANCE = meta.sll.sll.impl.SllPackageImpl.init();

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.ProgramImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__DEFS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.DefinitionImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__BODY = 2;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.FDefinitionImpl <em>FDefinition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.FDefinitionImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getFDefinition()
   * @generated
   */
  int FDEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FDEFINITION__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FDEFINITION__PARAMS = DEFINITION__PARAMS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FDEFINITION__BODY = DEFINITION__BODY;

  /**
   * The number of structural features of the '<em>FDefinition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FDEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.GDefinitionImpl <em>GDefinition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.GDefinitionImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getGDefinition()
   * @generated
   */
  int GDEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFINITION__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFINITION__PARAMS = DEFINITION__PARAMS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFINITION__BODY = DEFINITION__BODY;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFINITION__PATTERN = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GDefinition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.PatternImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__ARGS = 1;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.ExpressionImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.FCallImpl <em>FCall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.FCallImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getFCall()
   * @generated
   */
  int FCALL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FCALL__NAME = EXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FCALL__ARGS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FCall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FCALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.GCallImpl <em>GCall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.GCallImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getGCall()
   * @generated
   */
  int GCALL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GCALL__NAME = EXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GCALL__ARGS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GCall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GCALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.CtrImpl <em>Ctr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.CtrImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getCtr()
   * @generated
   */
  int CTR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTR__NAME = EXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTR__ARGS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ctr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link meta.sll.sll.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see meta.sll.sll.impl.VarImpl
   * @see meta.sll.sll.impl.SllPackageImpl#getVar()
   * @generated
   */
  int VAR = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = EXPRESSION__NAME;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link meta.sll.sll.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see meta.sll.sll.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link meta.sll.sll.Program#getDefs <em>Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defs</em>'.
   * @see meta.sll.sll.Program#getDefs()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Defs();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see meta.sll.sll.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the attribute '{@link meta.sll.sll.Definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see meta.sll.sll.Definition#getName()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Name();

  /**
   * Returns the meta object for the attribute list '{@link meta.sll.sll.Definition#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see meta.sll.sll.Definition#getParams()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Params();

  /**
   * Returns the meta object for the containment reference '{@link meta.sll.sll.Definition#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see meta.sll.sll.Definition#getBody()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Body();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.FDefinition <em>FDefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FDefinition</em>'.
   * @see meta.sll.sll.FDefinition
   * @generated
   */
  EClass getFDefinition();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.GDefinition <em>GDefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GDefinition</em>'.
   * @see meta.sll.sll.GDefinition
   * @generated
   */
  EClass getGDefinition();

  /**
   * Returns the meta object for the containment reference '{@link meta.sll.sll.GDefinition#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see meta.sll.sll.GDefinition#getPattern()
   * @see #getGDefinition()
   * @generated
   */
  EReference getGDefinition_Pattern();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see meta.sll.sll.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the attribute '{@link meta.sll.sll.Pattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see meta.sll.sll.Pattern#getName()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Name();

  /**
   * Returns the meta object for the attribute list '{@link meta.sll.sll.Pattern#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see meta.sll.sll.Pattern#getArgs()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Args();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see meta.sll.sll.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link meta.sll.sll.Expression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see meta.sll.sll.Expression#getName()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Name();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.FCall <em>FCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FCall</em>'.
   * @see meta.sll.sll.FCall
   * @generated
   */
  EClass getFCall();

  /**
   * Returns the meta object for the containment reference list '{@link meta.sll.sll.FCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see meta.sll.sll.FCall#getArgs()
   * @see #getFCall()
   * @generated
   */
  EReference getFCall_Args();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.GCall <em>GCall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GCall</em>'.
   * @see meta.sll.sll.GCall
   * @generated
   */
  EClass getGCall();

  /**
   * Returns the meta object for the containment reference list '{@link meta.sll.sll.GCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see meta.sll.sll.GCall#getArgs()
   * @see #getGCall()
   * @generated
   */
  EReference getGCall_Args();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.Ctr <em>Ctr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ctr</em>'.
   * @see meta.sll.sll.Ctr
   * @generated
   */
  EClass getCtr();

  /**
   * Returns the meta object for the containment reference list '{@link meta.sll.sll.Ctr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see meta.sll.sll.Ctr#getArgs()
   * @see #getCtr()
   * @generated
   */
  EReference getCtr_Args();

  /**
   * Returns the meta object for class '{@link meta.sll.sll.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see meta.sll.sll.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SllFactory getSllFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.ProgramImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__DEFS = eINSTANCE.getProgram_Defs();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.DefinitionImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__PARAMS = eINSTANCE.getDefinition_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__BODY = eINSTANCE.getDefinition_Body();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.FDefinitionImpl <em>FDefinition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.FDefinitionImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getFDefinition()
     * @generated
     */
    EClass FDEFINITION = eINSTANCE.getFDefinition();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.GDefinitionImpl <em>GDefinition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.GDefinitionImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getGDefinition()
     * @generated
     */
    EClass GDEFINITION = eINSTANCE.getGDefinition();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GDEFINITION__PATTERN = eINSTANCE.getGDefinition_Pattern();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.PatternImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__ARGS = eINSTANCE.getPattern_Args();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.ExpressionImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.FCallImpl <em>FCall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.FCallImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getFCall()
     * @generated
     */
    EClass FCALL = eINSTANCE.getFCall();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FCALL__ARGS = eINSTANCE.getFCall_Args();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.GCallImpl <em>GCall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.GCallImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getGCall()
     * @generated
     */
    EClass GCALL = eINSTANCE.getGCall();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GCALL__ARGS = eINSTANCE.getGCall_Args();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.CtrImpl <em>Ctr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.CtrImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getCtr()
     * @generated
     */
    EClass CTR = eINSTANCE.getCtr();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CTR__ARGS = eINSTANCE.getCtr_Args();

    /**
     * The meta object literal for the '{@link meta.sll.sll.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see meta.sll.sll.impl.VarImpl
     * @see meta.sll.sll.impl.SllPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

  }

} //SllPackage
