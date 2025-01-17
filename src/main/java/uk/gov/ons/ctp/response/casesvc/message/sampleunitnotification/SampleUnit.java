package uk.gov.ons.ctp.response.casesvc.message.sampleunitnotification;

import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.*;

/**
 * Java class for SampleUnit complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SampleUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sampleUnitRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sampleUnitType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectionInstrumentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionPlanId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SampleUnit",
        propOrder = {
                "id",
                "sampleUnitRef",
                "sampleUnitType",
                "partyId",
                "collectionInstrumentId",
                "activeEnrolment",
                "actionPlanId"
        })
@XmlSeeAlso({SampleUnitParent.class})
public class SampleUnit {

  protected String id;

  @XmlElement(required = true)
  protected String sampleUnitRef;

  @XmlElement(required = true)
  protected String sampleUnitType;

  protected String partyId;

  @XmlElement(required = true)
  protected String collectionInstrumentId;

  protected boolean activeEnrolment;

  protected String actionPlanId;

  /** Default no-arg constructor */
  public SampleUnit() {
    super();
  }

  /** Fully-initialising value constructor */
  public SampleUnit(
          final String id,
          final String sampleUnitRef,
          final String sampleUnitType,
          final String partyId,
          final String collectionInstrumentId,
          final boolean activeEnrolment,
          final String actionPlanId
  ) {
    this.id = id;
    this.sampleUnitRef = sampleUnitRef;
    this.sampleUnitType = sampleUnitType;
    this.partyId = partyId;
    this.collectionInstrumentId = collectionInstrumentId;
    this.actionPlanId = actionPlanId;
    this.activeEnrolment = activeEnrolment;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the sampleUnitRef property.
   *
   * @return possible object is {@link String }
   */
  public String getSampleUnitRef() {
    return sampleUnitRef;
  }

  /**
   * Sets the value of the sampleUnitRef property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSampleUnitRef(String value) {
    this.sampleUnitRef = value;
  }

  /**
   * Gets the value of the sampleUnitType property.
   *
   * @return possible object is {@link String }
   */
  public String getSampleUnitType() {
    return sampleUnitType;
  }

  /**
   * Sets the value of the sampleUnitType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSampleUnitType(String value) {
    this.sampleUnitType = value;
  }

  /**
   * Gets the value of the partyId property.
   *
   * @return possible object is {@link String }
   */
  public String getPartyId() {
    return partyId;
  }

  /**
   * Sets the value of the partyId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPartyId(String value) {
    this.partyId = value;
  }

  /**
   * Gets the value of the collectionInstrumentId property.
   *
   * @return possible object is {@link String }
   */
  public String getCollectionInstrumentId() {
    return collectionInstrumentId;
  }

  /**
   * Sets the value of the collectionInstrumentId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCollectionInstrumentId(String value) {
    this.collectionInstrumentId = value;
  }

  /**
   * Gets the value of the actionPlanId property.
   *
   * @return possible object is {@link String }
   */
  public String getActionPlanId() {
    return actionPlanId;
  }

  /**
   * Sets the value of the actionPlanId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setActionPlanId(String value) {
    if(value != null) {
      this.actionPlanId = value;
    }
  }

  public boolean isActiveEnrolment() {
    return activeEnrolment;
  }

  public void setActiveEnrolment(boolean activeEnrolment) {
    this.activeEnrolment = activeEnrolment;
  }

  /**
   * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method
   * and should not be called directly by client code.
   *
   * @param _other A builder instance to which the state of this object will be copied.
   */
  public <_B> void copyTo(final Builder<_B> _other) {
    _other.id = this.id;
    _other.sampleUnitRef = this.sampleUnitRef;
    _other.sampleUnitType = this.sampleUnitType;
    _other.partyId = this.partyId;
    _other.collectionInstrumentId = this.collectionInstrumentId;
    _other.activeEnrolment = this.activeEnrolment;
    _other.actionPlanId = this.actionPlanId;
  }

  public <_B> Builder<_B> newCopyBuilder(final _B _parentBuilder) {
    return new Builder<_B>(_parentBuilder, this, true);
  }

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
    final PropertyTree idPropertyTree = ((_propertyTree == null) ? null : _propertyTree.get("id"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (idPropertyTree != null)
            : ((idPropertyTree == null) || (!idPropertyTree.isLeaf())))) {
      _other.id = this.id;
    }
    final PropertyTree sampleUnitRefPropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitRef"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (sampleUnitRefPropertyTree != null)
            : ((sampleUnitRefPropertyTree == null) || (!sampleUnitRefPropertyTree.isLeaf())))) {
      _other.sampleUnitRef = this.sampleUnitRef;
    }
    final PropertyTree sampleUnitTypePropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitType"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (sampleUnitTypePropertyTree != null)
            : ((sampleUnitTypePropertyTree == null) || (!sampleUnitTypePropertyTree.isLeaf())))) {
      _other.sampleUnitType = this.sampleUnitType;
    }
    final PropertyTree partyIdPropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("partyId"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (partyIdPropertyTree != null)
            : ((partyIdPropertyTree == null) || (!partyIdPropertyTree.isLeaf())))) {
      _other.partyId = this.partyId;
    }
    final PropertyTree collectionInstrumentIdPropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("collectionInstrumentId"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (collectionInstrumentIdPropertyTree != null)
            : ((collectionInstrumentIdPropertyTree == null)
            || (!collectionInstrumentIdPropertyTree.isLeaf())))) {
      _other.collectionInstrumentId = this.collectionInstrumentId;
    }
    final PropertyTree activeEnrolmentPropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("activeEnrolment"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (activeEnrolmentPropertyTree != null)
            : ((activeEnrolmentPropertyTree == null) || (!activeEnrolmentPropertyTree.isLeaf())))) {
      _other.activeEnrolment = this.activeEnrolment;
    }
    final PropertyTree actionPlanIdPropertyTree =
            ((_propertyTree == null) ? null : _propertyTree.get("actionPlanId"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
            ? (actionPlanIdPropertyTree != null)
            : ((actionPlanIdPropertyTree == null) || (!actionPlanIdPropertyTree.isLeaf())))) {
      _other.actionPlanId = this.actionPlanId;
    }
  }

  public <_B> Builder<_B> newCopyBuilder(
          final _B _parentBuilder,
          final PropertyTree _propertyTree,
          final PropertyTreeUse _propertyTreeUse) {
    return new Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
  }

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

  public static Builder<Void> copyExcept(
          final SampleUnit _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static Builder<Void> copyOnly(final SampleUnit _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
  }

  public static class Builder<_B> implements Buildable {

    protected final _B _parentBuilder;
    protected final SampleUnit _storedValue;
    private String id;
    private String sampleUnitRef;
    private String sampleUnitType;
    private String partyId;
    private String collectionInstrumentId;
    private boolean activeEnrolment;
    private String actionPlanId;

    public Builder(final _B _parentBuilder, final SampleUnit _other, final boolean _copy) {
      this._parentBuilder = _parentBuilder;
      if (_other != null) {
        if (_copy) {
          _storedValue = null;
          this.id = _other.id;
          this.sampleUnitRef = _other.sampleUnitRef;
          this.sampleUnitType = _other.sampleUnitType;
          this.partyId = _other.partyId;
          this.collectionInstrumentId = _other.collectionInstrumentId;
          this.actionPlanId = _other.actionPlanId;
          this.activeEnrolment = _other.activeEnrolment;
        } else {
          _storedValue = _other;
        }
      } else {
        _storedValue = null;
      }
    }

    public Builder(
            final _B _parentBuilder,
            final SampleUnit _other,
            final boolean _copy,
            final PropertyTree _propertyTree,
            final PropertyTreeUse _propertyTreeUse) {
      this._parentBuilder = _parentBuilder;
      if (_other != null) {
        if (_copy) {
          _storedValue = null;
          final PropertyTree idPropertyTree =
                  ((_propertyTree == null) ? null : _propertyTree.get("id"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
                  ? (idPropertyTree != null)
                  : ((idPropertyTree == null) || (!idPropertyTree.isLeaf())))) {
            this.id = _other.id;
          }
          final PropertyTree sampleUnitRefPropertyTree =
                  ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitRef"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
                  ? (sampleUnitRefPropertyTree != null)
                  : ((sampleUnitRefPropertyTree == null) || (!sampleUnitRefPropertyTree.isLeaf())))) {
            this.sampleUnitRef = _other.sampleUnitRef;
          }
          final PropertyTree sampleUnitTypePropertyTree =
                  ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitType"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
                  ? (sampleUnitTypePropertyTree != null)
                  : ((sampleUnitTypePropertyTree == null) || (!sampleUnitTypePropertyTree.isLeaf())))) {
            this.sampleUnitType = _other.sampleUnitType;
          }
          final PropertyTree partyIdPropertyTree =
                  ((_propertyTree == null) ? null : _propertyTree.get("partyId"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
                  ? (partyIdPropertyTree != null)
                  : ((partyIdPropertyTree == null) || (!partyIdPropertyTree.isLeaf())))) {
            this.partyId = _other.partyId;
          }
          final PropertyTree collectionInstrumentIdPropertyTree =
                  ((_propertyTree == null) ? null : _propertyTree.get("collectionInstrumentId"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
                  ? (collectionInstrumentIdPropertyTree != null)
                  : ((collectionInstrumentIdPropertyTree == null)
                  || (!collectionInstrumentIdPropertyTree.isLeaf())))) {
            this.collectionInstrumentId = _other.collectionInstrumentId;
          }
          final PropertyTree activeEnrolmentPropertyTree =
                  ((_propertyTree == null) ? null : _propertyTree.get("activeEnrolment"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
                  ? (activeEnrolmentPropertyTree != null)
                  : ((activeEnrolmentPropertyTree == null) || (!activeEnrolmentPropertyTree.isLeaf())))) {
            this.activeEnrolment = _other.activeEnrolment;
          }
          final PropertyTree actionPlanIdPropertyTree =
                  ((_propertyTree == null) ? null : _propertyTree.get("actionPlanId"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
                  ? (actionPlanIdPropertyTree != null)
                  : ((actionPlanIdPropertyTree == null) || (!actionPlanIdPropertyTree.isLeaf())))) {
            this.actionPlanId = _other.actionPlanId;
          }
        } else {
          _storedValue = _other;
        }
      } else {
        _storedValue = null;
      }
    }

    public _B end() {
      return this._parentBuilder;
    }

    protected <_P extends SampleUnit> _P init(final _P _product) {
      _product.id = this.id;
      _product.sampleUnitRef = this.sampleUnitRef;
      _product.sampleUnitType = this.sampleUnitType;
      _product.partyId = this.partyId;
      _product.collectionInstrumentId = this.collectionInstrumentId;
      _product.activeEnrolment = this.activeEnrolment;
      _product.actionPlanId = this.actionPlanId;
      return _product;
    }

    /**
     * Sets the new value of "id" (any previous value will be replaced)
     *
     * @param id New value of the "id" property.
     */
    public Builder<_B> withId(final String id) {
      this.id = id;
      return this;
    }

    /**
     * Sets the new value of "sampleUnitRef" (any previous value will be replaced)
     *
     * @param sampleUnitRef New value of the "sampleUnitRef" property.
     */
    public Builder<_B> withSampleUnitRef(final String sampleUnitRef) {
      this.sampleUnitRef = sampleUnitRef;
      return this;
    }

    /**
     * Sets the new value of "sampleUnitType" (any previous value will be replaced)
     *
     * @param sampleUnitType New value of the "sampleUnitType" property.
     */
    public Builder<_B> withSampleUnitType(final String sampleUnitType) {
      this.sampleUnitType = sampleUnitType;
      return this;
    }

    /**
     * Sets the new value of "partyId" (any previous value will be replaced)
     *
     * @param partyId New value of the "partyId" property.
     */
    public Builder<_B> withPartyId(final String partyId) {
      this.partyId = partyId;
      return this;
    }

    /**
     * Sets the new value of "collectionInstrumentId" (any previous value will be replaced)
     *
     * @param collectionInstrumentId New value of the "collectionInstrumentId" property.
     */
    public Builder<_B> withCollectionInstrumentId(final String collectionInstrumentId) {
      this.collectionInstrumentId = collectionInstrumentId;
      return this;
    }

    /**
     * Sets the new value of "actionPlanId" (any previous value will be replaced)
     *
     * @param actionPlanId New value of the "actionPlanId" property.
     */
    public Builder<_B> withActionPlanId(final String actionPlanId) {
      this.actionPlanId = actionPlanId;
      return this;
    }

    public Builder<_B> withActiveEnrolment(final boolean activeEnrolment) {
      this.activeEnrolment = activeEnrolment;
      return this;
    }

    @Override
    public SampleUnit build() {
      if (_storedValue == null) {
        return this.init(new SampleUnit());
      } else {
        return ((SampleUnit) _storedValue);
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
          extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> id = null;
    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitRef = null;
    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitType = null;
    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> partyId = null;
    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> collectionInstrumentId =
            null;
    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> activeEnrolment = null;
    private com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> actionPlanId = null;


    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.id != null) {
        products.put("id", this.id.init());
      }
      if (this.sampleUnitRef != null) {
        products.put("sampleUnitRef", this.sampleUnitRef.init());
      }
      if (this.sampleUnitType != null) {
        products.put("sampleUnitType", this.sampleUnitType.init());
      }
      if (this.partyId != null) {
        products.put("partyId", this.partyId.init());
      }
      if (this.collectionInstrumentId != null) {
        products.put("collectionInstrumentId", this.collectionInstrumentId.init());
      }
      if (this.actionPlanId != null) {
        products.put("actionPlanId", this.actionPlanId.init());
      }
      if (this.activeEnrolment != null) {
        products.put("activeEnrolment", this.activeEnrolment.init());
      }
      return products;
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> id() {
      return ((this.id == null)
              ? this.id =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                      this._root, this, "id")
              : this.id);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitRef() {
      return ((this.sampleUnitRef == null)
              ? this.sampleUnitRef =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                      this._root, this, "sampleUnitRef")
              : this.sampleUnitRef);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitType() {
      return ((this.sampleUnitType == null)
              ? this.sampleUnitType =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                      this._root, this, "sampleUnitType")
              : this.sampleUnitType);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> partyId() {
      return ((this.partyId == null)
              ? this.partyId =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                      this._root, this, "partyId")
              : this.partyId);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> collectionInstrumentId() {
      return ((this.collectionInstrumentId == null)
              ? this.collectionInstrumentId =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                      this._root, this, "collectionInstrumentId")
              : this.collectionInstrumentId);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> activeEnrolment() {
      return ((this.activeEnrolment == null)
              ? this.activeEnrolment =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                      this._root, this, "activeEnrolment")
              : this.activeEnrolment);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>> actionPlanId() {
      return ((this.actionPlanId == null)
              ? this.actionPlanId =
              new com.kscs.util.jaxb.Selector<TRoot, Selector<TRoot, TParent>>(
                      this._root, this, "actionPlanId")
              : this.actionPlanId);
    }
  }
}