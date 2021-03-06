/**
 */
package meta.sll.sll;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.sll.sll.Ctr#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.sll.sll.SllPackage#getCtr()
 * @model
 * @generated
 */
public interface Ctr extends Expression
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link meta.sll.sll.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see meta.sll.sll.SllPackage#getCtr_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // Ctr
