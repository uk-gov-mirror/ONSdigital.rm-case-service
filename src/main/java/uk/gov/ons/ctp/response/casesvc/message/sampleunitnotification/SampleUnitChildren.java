package uk.gov.ons.ctp.response.casesvc.message.sampleunitnotification;

import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for SampleUnitChildren complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SampleUnitChildren"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sampleUnitChild" type="{http://ons.gov.uk/ctp/response/casesvc/message/sampleunitnotification}SampleUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "SampleUnitChildren",
    propOrder = {"sampleUnitchildren"})
public class SampleUnitChildren {

  @XmlElement(name = "sampleUnitChild")
  protected List<SampleUnit> sampleUnitchildren;

  /** Default no-arg constructor */
  public SampleUnitChildren() {
    super();
  }

  /** Fully-initialising value constructor */
  public SampleUnitChildren(final List<SampleUnit> sampleUnitchildren) {
    this.sampleUnitchildren = sampleUnitchildren;
  }

  /**
   * Gets the value of the sampleUnitchildren property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the sampleUnitchildren property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getSampleUnitchildren().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link SampleUnit }
   */
  public List<SampleUnit> getSampleUnitchildren() {
    if (sampleUnitchildren == null) {
      sampleUnitchildren = new ArrayList<SampleUnit>();
    }
    return this.sampleUnitchildren;
  }

  /**
   * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method
   * and should not be called directly by client code.
   *
   * @param _other A builder instance to which the state of this object will be copied.
   */
  public <_B> void copyTo(final Builder<_B> _other) {
    if (this.sampleUnitchildren == null) {
      _other.sampleUnitchildren = null;
    } else {
      _other.sampleUnitchildren = new ArrayList<SampleUnit.Builder<Builder<_B>>>();
      for (SampleUnit _item : this.sampleUnitchildren) {
        _other.sampleUnitchildren.add(((_item == null) ? null : _item.newCopyBuilder(_other)));
      }
    }
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

  public static <_B> Builder<_B> copyOf(final SampleUnitChildren _other) {
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
    final PropertyTree sampleUnitchildrenPropertyTree =
        ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitchildren"));
    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
        ? (sampleUnitchildrenPropertyTree != null)
        : ((sampleUnitchildrenPropertyTree == null)
            || (!sampleUnitchildrenPropertyTree.isLeaf())))) {
      if (this.sampleUnitchildren == null) {
        _other.sampleUnitchildren = null;
      } else {
        _other.sampleUnitchildren = new ArrayList<SampleUnit.Builder<Builder<_B>>>();
        for (SampleUnit _item : this.sampleUnitchildren) {
          _other.sampleUnitchildren.add(
              ((_item == null)
                  ? null
                  : _item.newCopyBuilder(
                      _other, sampleUnitchildrenPropertyTree, _propertyTreeUse)));
        }
      }
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
      final SampleUnitChildren _other,
      final PropertyTree _propertyTree,
      final PropertyTreeUse _propertyTreeUse) {
    final Builder<_B> _newBuilder = new Builder<_B>(null, null, false);
    _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
    return _newBuilder;
  }

  public static Builder<Void> copyExcept(
      final SampleUnitChildren _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static Builder<Void> copyOnly(
      final SampleUnitChildren _other, final PropertyTree _propertyTree) {
    return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
  }

  public static class Builder<_B> implements Buildable {

    protected final _B _parentBuilder;
    protected final SampleUnitChildren _storedValue;
    private List<SampleUnit.Builder<Builder<_B>>> sampleUnitchildren;

    public Builder(final _B _parentBuilder, final SampleUnitChildren _other, final boolean _copy) {
      this._parentBuilder = _parentBuilder;
      if (_other != null) {
        if (_copy) {
          _storedValue = null;
          if (_other.sampleUnitchildren == null) {
            this.sampleUnitchildren = null;
          } else {
            this.sampleUnitchildren = new ArrayList<SampleUnit.Builder<Builder<_B>>>();
            for (SampleUnit _item : _other.sampleUnitchildren) {
              this.sampleUnitchildren.add(((_item == null) ? null : _item.newCopyBuilder(this)));
            }
          }
        } else {
          _storedValue = _other;
        }
      } else {
        _storedValue = null;
      }
    }

    public Builder(
        final _B _parentBuilder,
        final SampleUnitChildren _other,
        final boolean _copy,
        final PropertyTree _propertyTree,
        final PropertyTreeUse _propertyTreeUse) {
      this._parentBuilder = _parentBuilder;
      if (_other != null) {
        if (_copy) {
          _storedValue = null;
          final PropertyTree sampleUnitchildrenPropertyTree =
              ((_propertyTree == null) ? null : _propertyTree.get("sampleUnitchildren"));
          if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)
              ? (sampleUnitchildrenPropertyTree != null)
              : ((sampleUnitchildrenPropertyTree == null)
                  || (!sampleUnitchildrenPropertyTree.isLeaf())))) {
            if (_other.sampleUnitchildren == null) {
              this.sampleUnitchildren = null;
            } else {
              this.sampleUnitchildren = new ArrayList<SampleUnit.Builder<Builder<_B>>>();
              for (SampleUnit _item : _other.sampleUnitchildren) {
                this.sampleUnitchildren.add(
                    ((_item == null)
                        ? null
                        : _item.newCopyBuilder(
                            this, sampleUnitchildrenPropertyTree, _propertyTreeUse)));
              }
            }
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

    protected <_P extends SampleUnitChildren> _P init(final _P _product) {
      if (this.sampleUnitchildren != null) {
        final List<SampleUnit> sampleUnitchildren =
            new ArrayList<SampleUnit>(this.sampleUnitchildren.size());
        for (SampleUnit.Builder<Builder<_B>> _item : this.sampleUnitchildren) {
          sampleUnitchildren.add(_item.build());
        }
        _product.sampleUnitchildren = sampleUnitchildren;
      }
      return _product;
    }

    /**
     * Adds the given items to the value of "sampleUnitchildren"
     *
     * @param sampleUnitchildren Items to add to the value of the "sampleUnitchildren" property
     */
    public Builder<_B> addSampleUnitchildren(
        final Iterable<? extends SampleUnit> sampleUnitchildren) {
      if (sampleUnitchildren != null) {
        if (this.sampleUnitchildren == null) {
          this.sampleUnitchildren = new ArrayList<SampleUnit.Builder<Builder<_B>>>();
        }
        for (SampleUnit _item : sampleUnitchildren) {
          this.sampleUnitchildren.add(new SampleUnit.Builder<Builder<_B>>(this, _item, false));
        }
      }
      return this;
    }

    /**
     * Sets the new value of "sampleUnitchildren" (any previous value will be replaced)
     *
     * @param sampleUnitchildren New value of the "sampleUnitchildren" property.
     */
    public Builder<_B> withSampleUnitchildren(
        final Iterable<? extends SampleUnit> sampleUnitchildren) {
      if (this.sampleUnitchildren != null) {
        this.sampleUnitchildren.clear();
      }
      return addSampleUnitchildren(sampleUnitchildren);
    }

    /**
     * Adds the given items to the value of "sampleUnitchildren"
     *
     * @param sampleUnitchildren Items to add to the value of the "sampleUnitchildren" property
     */
    public Builder<_B> addSampleUnitchildren(SampleUnit... sampleUnitchildren) {
      addSampleUnitchildren(Arrays.asList(sampleUnitchildren));
      return this;
    }

    /**
     * Sets the new value of "sampleUnitchildren" (any previous value will be replaced)
     *
     * @param sampleUnitchildren New value of the "sampleUnitchildren" property.
     */
    public Builder<_B> withSampleUnitchildren(SampleUnit... sampleUnitchildren) {
      withSampleUnitchildren(Arrays.asList(sampleUnitchildren));
      return this;
    }

    /**
     * Returns a new builder to build an additional value of the "SampleUnitchildren" property. Use
     * {@link SampleUnit.Builder#end()} to return to the current builder.
     *
     * @return a new builder to build an additional value of the "SampleUnitchildren" property. Use
     *     {@link SampleUnit.Builder#end()} to return to the current builder.
     */
    public SampleUnit.Builder<? extends Builder<_B>> addSampleUnitchildren() {
      if (this.sampleUnitchildren == null) {
        this.sampleUnitchildren = new ArrayList<SampleUnit.Builder<Builder<_B>>>();
      }
      final SampleUnit.Builder<Builder<_B>> sampleUnitchildren_Builder =
          new SampleUnit.Builder<Builder<_B>>(this, null, false);
      this.sampleUnitchildren.add(sampleUnitchildren_Builder);
      return sampleUnitchildren_Builder;
    }

    @Override
    public SampleUnitChildren build() {
      if (_storedValue == null) {
        return this.init(new SampleUnitChildren());
      } else {
        return ((SampleUnitChildren) _storedValue);
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

    private SampleUnit.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitchildren = null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.sampleUnitchildren != null) {
        products.put("sampleUnitchildren", this.sampleUnitchildren.init());
      }
      return products;
    }

    public SampleUnit.Selector<TRoot, Selector<TRoot, TParent>> sampleUnitchildren() {
      return ((this.sampleUnitchildren == null)
          ? this.sampleUnitchildren =
              new SampleUnit.Selector<TRoot, Selector<TRoot, TParent>>(
                  this._root, this, "sampleUnitchildren")
          : this.sampleUnitchildren);
    }
  }
}
