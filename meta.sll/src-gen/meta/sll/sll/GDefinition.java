/**
 */
package meta.sll.sll;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.sll.sll.GDefinition#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.sll.sll.SllPackage#getGDefinition()
 * @model
 * @generated
 */
public interface GDefinition extends Definition
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Pattern)
   * @see meta.sll.sll.SllPackage#getGDefinition_Pattern()
   * @model containment="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link meta.sll.sll.GDefinition#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

} // GDefinition
