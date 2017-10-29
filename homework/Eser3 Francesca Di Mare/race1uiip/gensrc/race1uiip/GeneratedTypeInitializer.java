

package race1uiip;

import java.util.*;
import java.io.Serializable;
import de.hybris.platform.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.type.*;
import de.hybris.platform.persistence.enumeration.*;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.persistence.*;

/**
 * Generated by hybris Platform.
 */
@SuppressWarnings({"cast","unused","boxing","null", "PMD"})
public class GeneratedTypeInitializer extends AbstractTypeInitializer
{
	/**
	 * Generated by hybris Platform.
	 */
	public GeneratedTypeInitializer( ManagerEJB manager, Map params )
	{
		super( manager, params );
	}


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected void performRemoveObjects( ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// no-op by now
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateTypes
	
	
		createItemType(
			"Cyclist",
			"GenericItem",
			my.race1uiip.jalo.Cyclist.class,
			"de.hybris.platform.persistence.race1uiip_Cyclist",
			false,
			null,
			false
		);
	
		createItemType(
			"StageRace",
			"GenericItem",
			my.race1uiip.jalo.StageRace.class,
			"de.hybris.platform.persistence.race1uiip_StageRace",
			false,
			null,
			false
		);
	
		createItemType(
			"Stage",
			"GenericItem",
			my.race1uiip.jalo.Stage.class,
			"de.hybris.platform.persistence.race1uiip_Stage",
			false,
			null,
			false
		);
	
		createItemType(
			"StageRanking",
			"GenericItem",
			my.race1uiip.jalo.StageRanking.class,
			"de.hybris.platform.persistence.race1uiip_StageRanking",
			false,
			null,
			false
		);
	
		createRelationType(
			"StageRace2CyclistRelation",
			null,
			true
		);
	
		createRelationType(
			"StageRace2StageRelation",
			null,
			true
		);
	
		createRelationType(
			"Stage2CyclistRelation",
			"de.hybris.platform.persistence.link.race1uiip_Stage2CyclistRelation",
			false
		);
	
		createEnumerationType(
			"retiredEnum",
			null
		);
	
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performModifyTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performModifyTypes
	

	
	
				single_createattr_Cyclist_id();
			
				single_createattr_Cyclist_name();
			
				single_createattr_Cyclist_stageRanking();
			
				single_createattr_StageRace_id();
			
				single_createattr_StageRace_name();
			
				single_createattr_StageRace_numberStage();
			
				single_createattr_Stage_id();
			
				single_createattr_Stage_name();
			
				single_createattr_Stage_stageLength();
			
				single_createattr_StageRanking_id();
			
				single_createattr_StageRanking_time();
			
				single_createattr_StageRanking_position();
			
				single_createattr_StageRanking_retired();
			
		createRelationAttributes(
			"StageRace2CyclistRelation", 
			false, 

			"stageRace", 
			"StageRace", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			false,
			false,
			CollectionType.COLLECTION,
			"cyclist", 
			"Cyclist", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION
		);
	
		createRelationAttributes(
			"StageRace2StageRelation", 
			false, 

			"stageRace", 
			"StageRace", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			false,
			false,
			CollectionType.COLLECTION,
			"stage", 
			"Stage", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION
		);
	
		createRelationAttributes(
			"Stage2CyclistRelation", 
			false, 

			"stage", 
			"Stage", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION,
			"cyclist", 
			"Cyclist", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION
		);
	

	}

	
	public void single_createattr_Cyclist_id() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Cyclist", 
					"id",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Cyclist_name() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Cyclist", 
					"name",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Cyclist_stageRanking() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Cyclist", 
					"stageRanking",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_StageRace_id() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"StageRace", 
					"id",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_StageRace_name() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"StageRace", 
					"name",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_StageRace_numberStage() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"StageRace", 
					"numberStage",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stage_id() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stage", 
					"id",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stage_name() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stage", 
					"name",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stage_stageLength() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stage", 
					"stageLength",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_StageRanking_id() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"StageRanking", 
					"id",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_StageRanking_time() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"StageRanking", 
					"time",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_StageRanking_position() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"StageRanking", 
					"position",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_StageRanking_retired() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"StageRanking", 
					"retired",  
					null,
					"retiredEnum",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateObjects( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateObjects
	
	
		createEnumerationValues(
			"retiredEnum",
			true,
			Arrays.asList( new String[] {
			
				"YES",
				"NO"
			} )
		);
	
		single_setRelAttributeProperties_StageRace2CyclistRelation_source();
	
		single_setRelAttributeProperties_StageRace2StageRelation_source();
	
		single_setRelAttributeProperties_Stage2CyclistRelation_source();
	
		single_setRelAttributeProperties_StageRace2CyclistRelation_target();
	
		single_setRelAttributeProperties_StageRace2StageRelation_target();
	
		single_setRelAttributeProperties_Stage2CyclistRelation_target();
	
		connectRelation(
			"StageRace2CyclistRelation", 
			false, 
			"stageRace", 
			"StageRace", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			"cyclist", 
			"Cyclist", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			true
		);
	
		connectRelation(
			"StageRace2StageRelation", 
			false, 
			"stageRace", 
			"StageRace", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			"stage", 
			"Stage", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			true
		);
	
		connectRelation(
			"Stage2CyclistRelation", 
			false, 
			"stage", 
			"Stage", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			"cyclist", 
			"Cyclist", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			true
		);
	
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"Cyclist",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_Cyclist_id();
		
			single_setAttributeProperties_Cyclist_name();
		
			single_setAttributeProperties_Cyclist_stageRanking();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"StageRace",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_StageRace_id();
		
			single_setAttributeProperties_StageRace_name();
		
			single_setAttributeProperties_StageRace_numberStage();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"Stage",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_Stage_id();
		
			single_setAttributeProperties_Stage_name();
		
			single_setAttributeProperties_Stage_stageLength();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"StageRanking",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_StageRanking_id();
		
			single_setAttributeProperties_StageRanking_time();
		
			single_setAttributeProperties_StageRanking_position();
		
			single_setAttributeProperties_StageRanking_retired();
		
				setDefaultProperties(
					"retiredEnum",
					true,
					true,
					null
				);
			
	}


		
						public void single_setAttributeProperties_Cyclist_id() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Cyclist", 
								"id",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Cyclist_name() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Cyclist", 
								"name",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Cyclist_stageRanking() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Cyclist", 
								"stageRanking",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_StageRace_id() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"StageRace", 
								"id",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_StageRace_name() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"StageRace", 
								"name",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_StageRace_numberStage() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"StageRace", 
								"numberStage",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stage_id() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stage", 
								"id",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stage_name() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stage", 
								"name",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stage_stageLength() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stage", 
								"stageLength",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_StageRanking_id() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"StageRanking", 
								"id",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_StageRanking_time() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"StageRanking", 
								"time",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_StageRanking_position() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"StageRanking", 
								"position",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_StageRanking_retired() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"StageRanking", 
								"retired",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
								public void single_setRelAttributeProperties_StageRace2CyclistRelation_source() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Cyclist", 
										"stageRace",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_StageRace2CyclistRelation_target() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"StageRace", 
										"cyclist",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_StageRace2StageRelation_source() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Stage", 
										"stageRace",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_StageRace2StageRelation_target() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"StageRace", 
										"stage",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_Stage2CyclistRelation_source() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Cyclist", 
										"stage",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_Stage2CyclistRelation_target() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Stage", 
										"cyclist",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
}

	