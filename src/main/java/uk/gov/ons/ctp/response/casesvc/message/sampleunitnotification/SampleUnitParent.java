package uk.gov.ons.ctp.response.casesvc.message.sampleunitnotification;

import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.*;

/**
 * Java class for SampleUnitParent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SampleUnitParent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ons.gov.uk/ctp/response/casesvc/message/sampleunitnotification}SampleUnit"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionExerciseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sampleUnitChildren" type="{http://ons.gov.uk/ctp/response/casesvc/message/sampleunitnotification}SampleUnitChildren" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "SampleUnitParent",
    propOrder = {"collectionExerciseId", "sampleUnitChildren"})
@XmlRootElement(name = "sampleUnitParent")
public class SampleUnitParent extends SampleUnit {

  @XmlElement(required = true)
  protected String collectionExerciseId;

  protected SampleUnitChildren sampleUnitChildren;

  /** Default no-arg constructor */
  public SampleUnitParent() {
    super();
  }

  /** Fully-initialising value constructor */
  public SampleUnitParent(
      final String id,
      final String sampleUnitRef,
      final String sampleUnitType,
      final String partyId,
      final String collectionInstrumentId,
      final String actionPlanId,
      final String collectionExerciseId,
      final SampleUnitChildren sampleUnitChildren,
      final boolean activeEnrolment) {
    super(id, sampleUnitRef, sampleUnitType, partyId, collectionInstrumentId, activeEnrolment, actionPlanId);
    this.collectionExerciseId = collectionExerciseId;
    this.sampleUnitChildren = sampleUnitChildren;
  }

  /**
   * Gets the value of the collectionExerciseId property.
   *
   * @return possible object is {@link String }
   */
  public String getCollectionExerciseId() {
    return collectionExerciseId;
  }

  /**
   * Sets the value of the collectionExerciseId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCollectionExerciseId(String value) {
    this.collectionExerciseId = value;
  }

  /**
   * Gets the value of the sampleUnitChildren property.
   *
   * @return possible object is {@link SampleUnitChildren }
   */
  public SampleUnitChildren getSampleUnitChildren() {
    return sampleUnitChildren;
  }

  /**
   * Sets the value of the sampleUnitChildren property.
   *
   * @param value allowed object is {@link SampleUnitChildren }
   */
  public void setSampleUnitChildren(SampleUnitChildren value) {
    this.sampleUnitChildren = value;
  }

  /**
   * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method
   * and should not be called directly by client code.
   *
   * @param _other A builder instance to which the state of this object will be copied.
   */
  public <_B> void copyTo(final Builder<_B> _other) {
    super.copyTo(_other);
    _other.collectionExerciseId = this.collectionExerciseId;
    _other.sampleUnitChildren =
        ((this.sampleUnitChildren == null) ? null : this.sampleUnitChildren.newCopyBuilder(_other));
  }

  @Override
  public <_B> Builder<_B> newCopyBuilder(final _B _parentBuilder) {
    return new Builder<_B>(_parentBuilder, this, true);
  }

  @Override
  public Builder<Void> newCopyBuilder() {
    return newCopyBuilder(null);
  }

  public static Builder<Void> builder() {
    return new Builder<Void>(null, null, false);
  }

  public static <_B> Builder<_B> copyOf(final SampleUnit _other) {
    final Builder<_B> _newBuilder = new Builder<_B>(null, null, false);
    _other.copyTo(_newBuilder);
    return _newBuilder;
  }

  public static <_B> Builder<_B> copyOf(final SampleUnitParent _other) {
    final Builder<_B> _newBuilder = new Builder<_B>(null, null, false);
    _other.copyTo(_newBuilder);
    return _newBuilder;
  }

  /**
   * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method
   * and should not be called directly by client code.
   *
   * @param _other A builder instance to which the state of this object will be copied.
   */
  public <_B> void copyTo(
      final Builder<_B> _other,
      final PropertyTree _propertyTree,
      final PropertyTreeUse _propertyTreeUse) {
    super.copyTo(_other, _propertyTree, _propertyTreeUse);
    final PropertyTree collectionExerciseIdPropertyTree =
        ((_propertyTree == null) ? null : _propertyTree.get("collectionExerciseId"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
        ? (collectionExerciseIdPropertyTree != null)
        : ((collectionExerciseIdPropertyTree == null)
            || (!collectionExerciseIdPropertyTree.isLeaf())))) {
      _other.collectionExerciseId = this.collectionExerciseId;
    }
    final PropertyTree sampleUnitChildrenPropertyTree =
        ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitChildren"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
        ? (sampleUnitChildrenPropertyTree != null)
        : ((sampleUnitChildrenPropertyTree == null)
            || (!sampleUnitChildrenPropertyTree.isLeaf())))) {
      _other.sampleUnitChildren =
          ((this.sampleUnitChildren == null)
              ? null
              : this.sampleUnitChildren.newCopyBuilder(
                  _other, sampleUnitChildrenPropertyTree, _propertyTreeUse));
    }
  }

  @Override
  public <_B> Builder<_B> newCopyBuilder(
      final _B _parentBuilder,
      final PropertyTree _propertyTree,
      final PropertyTreeUse _propertyTreeUse) {
    return new Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
  }

  @Override
  public Builder<Void> newCopyBuilder(
      final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
    return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
  }

  public static <_B> Builder<_B> copyOf(
      final SampleUnit _other,
      final PropertyTree _propertyTree,
      final PropertyTreeUse _propertyTreeUse) {
    final Builder<_B> _newBuilder = new Builder<_B>(null, null, false);
    _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
    return _newBuilder;
  }

  public static <_B> Builder<_B> copyOf(
      final SampleUnitParent _other,
      final PropertyTree _propertyTree,
      final PropertyTreeUse _propertyTreeUse) {
    final Builder<_B> _newBuilder = new Builder<_B>(null, null, false);
    _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
    return _newBuilder;
  }

  public static Builder<Void> copyExcept(
      final SampleUnit _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static Builder<Void> copyExcept(
      final SampleUnitParent _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static Builder<Void> copyOnly(final SampleUnit _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
  }

  public static Builder<Void> copyOnly(
      final SampleUnitParent _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
  }

  public static class Builder<_B> extends SampleUnit.Builder<_B> implements Buildable {

    private String collectionExerciseId;
    private SampleUnitChildren.Builder<Builder<_B>> sampleUnitChildren;

    public Builder(final _B _parentBuilder, final SampleUnitParent _other, final boolean _copy) {
      super(_parentBuilder, _other, _copy);
      if (_other != null) {
        this.collectionExerciseId = _other.collectionExerciseId;
        this.sampleUnitChildren =
            ((_other.sampleUnitChildren == null)
                ? null
                : _other.sampleUnitChildren.newCopyBuilder(this));
      }
    }

    public Builder(
        final _B _parentBuilder,
        final SampleUnitParent _other,
        final boolean _copy,
        final PropertyTree _propertyTree,
        final PropertyTreeUse _propertyTreeUse) {
      super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
      if (_other != null) {
        final PropertyTree collectionExerciseIdPropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("collectionExerciseId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (collectionExerciseIdPropertyTree != null)
            : ((collectionExerciseIdPropertyTree == null)
                || (!collectionExerciseIdPropertyTree.isLeaf())))) {
          this.collectionExerciseId = _other.collectionExerciseId;
        }
        final PropertyTree sampleUnitChildrenPropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitChildren"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (sampleUnitChildrenPropertyTree != null)
            : ((sampleUnitChildrenPropertyTree == null)
                || (!sampleUnitChildrenPropertyTree.isLeaf())))) {
          this.sampleUnitChildren =
              ((_other.sampleUnitChildren == null)
                  ? null
                  : _other.sampleUnitChildren.newCopyBuilder(
                      this, sampleUnitChildrenPropertyTree, _propertyTreeUse));
        }
      }
    }

    protected <_P extends SampleUnitParent> _P init(final _P _product) {
      _product.collectionExerciseId = this.collectionExerciseId;
      _product.sampleUnitChildren =
          ((this.sampleUnitChildren == null) ? null : this.sampleUnitChildren.build());
      return super.init(_product);
    }

    /**
     * Sets the new value of "collectionExerciseId" (any previous value will be replaced)
     *
     * @param collectionExerciseId New value of the "collectionExerciseId" property.
     */
    public Builder<_B> withCollectionExerciseId(final String collectionExerciseId) {
      this.collectionExerciseId = collectionExerciseId;
      return this;
    }

    /**
     * Sets the new value of "sampleUnitChildren" (any previous value will be replaced)
     *
     * @param sampleUnitChildren New value of the "sampleUnitChildren" property.
     */
    public Builder<_B> withSampleUnitChildren(final SampleUnitChildren sampleUnitChildren) {
      this.sampleUnitChildren =
          ((sampleUnitChildren == null)
              ? null
              : new SampleUnitChildren.Builder<Builder<_B>>(this, sampleUnitChildren, false));
      return this;
    }

    /**
     * Returns a new builder to build the value of the "sampleUnitChildren" property (replacing
     * previous value). Use {@link SampleUnitChildren.Builder#end()} to return to the current
     * builder.
     *
     * @return A new builder to build the value of the "sampleUnitChildren" property. Use {@link
     *     SampleUnitChildren.Builder#end()} to return to the current builder.
     */
    public SampleUnitChildren.Builder<? extends Builder<_B>> withSampleUnitChildren() {
      return this.sampleUnitChildren =
          new SampleUnitChildren.Builder<Builder<_B>>(this, null, false);
    }

    /**
     * Sets the new value of "id" (any previous value will be replaced)
     *
     * @param id New value of the "id" property.
     */
    @Override
    public Builder<_B> withId(final String id) {
      super.withId(id);
      return this;
    }

    /**
     * Sets the new value of "sampleUnitRef" (any previous value will be replaced)
     *
     * @param sampleUnitRef New value of the "sampleUnitRef" property.
     */
    @Override
    public Builder<_B> withSampleUnitRef(final String sampleUnitRef) {
      super.withSampleUnitRef(sampleUnitRef);
      return this;
    }

    /**
     * Sets the new value of "sampleUnitType" (any previous value will be replaced)
     *
     * @param sampleUnitType New value of the "sampleUnitType" property.
     */
    @Override
    public Builder<_B> withSampleUnitType(final String sampleUnitType) {
      super.withSampleUnitType(sampleUnitType);
      return this;
    }

    /**
     * Sets the new value of "partyId" (any previous value will be replaced)
     *
     * @param partyId New value of the "partyId" property.
     */
    @Override
    public Builder<_B> withPartyId(final String partyId) {
      super.withPartyId(partyId);
      return this;
    }

    /**
     * Sets the new value of "collectionInstrumentId" (any previous value will be replaced)
     *
     * @param collectionInstrumentId New value of the "collectionInstrumentId" property.
     */
    @Override
    public Builder<_B> withCollectionInstrumentId(final String collectionInstrumentId) {
      super.withCollectionInstrumentId(collectionInstrumentId);
      return this;
    }

    /**
     * Sets the new value of "actionPlanId" (any previous value will be replaced)
     *
     * @param actionPlanId New value of the "actionPlanId" property.
     */
    @Override
    public Builder<_B> withActionPlanId(final String actionPlanId) {
      super.withActionPlanId(actionPlanId);
      return this;
    }

    @Override
    public Builder<_B> withActiveEnrolment(final boolean activeEnrolment) {
      super.withActiveEnrolment(activeEnrolment);
      return this;
    }

    @Override
    public SampleUnitParent build() {
      if (_storedValue == null) {
        return this.init(new SampleUnitParent());
      } else {
        return ((SampleUnitParent) _storedValue);
      }
    }
  }

  public static class Select extends Selector<Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static Select _root() {
      return new Select();
    }
  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends SampleUnit.Selector<TRoot, TParent> {

    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> collectionExerciseId =
        null;
    private SampleUnitChildren.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitChildren = null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.collectionExerciseId != null) {
        products.put("collectionExerciseId", this.collectionExerciseId.init());
      }
      if (this.sampleUnitChildren != null) {
        products.put("sampleUnitChildren", this.sampleUnitChildren.init());
      }
      return products;
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> collectionExerciseId() {
      return ((this.collectionExerciseId == null)
          ? this.collectionExerciseId =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                  this._root, this, "collectionExerciseId")
          : this.collectionExerciseId);
    }

    public SampleUnitChildren.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitChildren() {
      return ((this.sampleUnitChildren == null)
          ? this.sampleUnitChildren =
              new SampleUnitChildren.Selector<TRoot, Selector<TRoot, TParent>>(
                  this._root, this, "sampleUnitChildren")
          : this.sampleUnitChildren);
    }
  }
}
