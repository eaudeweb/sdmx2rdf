package sdmx2rdf.converter;

import org.sdmxsource.sdmx.api.constants.SDMX_STRUCTURE_TYPE;
import org.springframework.stereotype.Service;

@Service
public class CodeListConverter extends ConceptSchemeConverter {

	@Override
	protected SDMX_STRUCTURE_TYPE getStructureType() {
		return SDMX_STRUCTURE_TYPE.CODE_LIST;
	}
}
