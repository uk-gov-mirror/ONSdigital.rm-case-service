package uk.gov.ons.ctp.response.casesvc;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;
import uk.gov.ons.ctp.response.casesvc.domain.model.*;
import uk.gov.ons.ctp.response.casesvc.representation.*;

/** The bean mapper that maps to/from DTOs and JPA entity types. */
@Component
public class CaseSvcBeanMapper extends ConfigurableMapper {

  /**
   * Setup the mapper for all of our beans. Only fields having non identical names need mapping if
   * we also use byDefault() following.
   *
   * @param factory the factory to which we add our mappings
   */
  protected final void configure(final MapperFactory factory) {

    factory.classMap(Case.class, CaseDTO.class).byDefault().register();

    factory.classMap(Case.class, CaseDetailsDTO.class).byDefault().register();

    factory
        .classMap(CaseGroup.class, CaseGroupDTO.class)
        .field("status", "caseGroupStatus")
        .byDefault()
        .register();

    factory.classMap(CaseEvent.class, CaseEventDTO.class).byDefault().register();

    factory
        .classMap(Category.class, CategoryDTO.class)
        .field("categoryName", "name")
        .byDefault()
        .register();

    factory.classMap(Response.class, ResponseDTO.class).byDefault().register();
  }
}
