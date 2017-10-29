/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 21.16.22                        ---
 * ----------------------------------------------------------------
 */
package my.race1uiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.race1uiip.constants.Race1uiipConstants;
import my.race1uiip.jalo.Cyclist;
import my.race1uiip.jalo.StageRace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStage extends GenericItem
{
	/** Qualifier of the <code>Stage.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Stage.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Stage.stageLength</code> attribute **/
	public static final String STAGELENGTH = "stageLength";
	/** Qualifier of the <code>Stage.stageRace</code> attribute **/
	public static final String STAGERACE = "stageRace";
	/** Qualifier of the <code>Stage.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/** Relation ordering override parameter constants for Stage2CyclistRelation from ((race1uiip))*/
	protected static String STAGE2CYCLISTRELATION_SRC_ORDERED = "relation.Stage2CyclistRelation.source.ordered";
	protected static String STAGE2CYCLISTRELATION_TGT_ORDERED = "relation.Stage2CyclistRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Stage2CyclistRelation from ((race1uiip))*/
	protected static String STAGE2CYCLISTRELATION_MARKMODIFIED = "relation.Stage2CyclistRelation.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGERACE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStage> STAGERACEHANDLER = new BidirectionalOneToManyHandler<GeneratedStage>(
	Race1uiipConstants.TC.STAGE,
	false,
	"stageRace",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(STAGELENGTH, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STAGERACEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Collection<Cyclist> getCyclist(final SessionContext ctx)
	{
		final List<Cyclist> items = getLinkedItems( 
			ctx,
			true,
			Race1uiipConstants.Relations.STAGE2CYCLISTRELATION,
			"Cyclist",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Collection<Cyclist> getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	public long getCyclistCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			Race1uiipConstants.Relations.STAGE2CYCLISTRELATION,
			"Cyclist",
			null
		);
	}
	
	public long getCyclistCount()
	{
		return getCyclistCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Collection<Cyclist> value)
	{
		setLinkedItems( 
			ctx,
			true,
			Race1uiipConstants.Relations.STAGE2CYCLISTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGE2CYCLISTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Collection<Cyclist> value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclist. 
	 * @param value the item to add to cyclist
	 */
	public void addToCyclist(final SessionContext ctx, final Cyclist value)
	{
		addLinkedItems( 
			ctx,
			true,
			Race1uiipConstants.Relations.STAGE2CYCLISTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGE2CYCLISTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclist. 
	 * @param value the item to add to cyclist
	 */
	public void addToCyclist(final Cyclist value)
	{
		addToCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclist. 
	 * @param value the item to remove from cyclist
	 */
	public void removeFromCyclist(final SessionContext ctx, final Cyclist value)
	{
		removeLinkedItems( 
			ctx,
			true,
			Race1uiipConstants.Relations.STAGE2CYCLISTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STAGE2CYCLISTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclist. 
	 * @param value the item to remove from cyclist
	 */
	public void removeFromCyclist(final Cyclist value)
	{
		removeFromCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageLength</code> attribute.
	 * @return the stageLength
	 */
	public String getStageLength(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STAGELENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageLength</code> attribute.
	 * @return the stageLength
	 */
	public String getStageLength()
	{
		return getStageLength( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageLength</code> attribute. 
	 * @param value the stageLength
	 */
	public void setStageLength(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STAGELENGTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageLength</code> attribute. 
	 * @param value the stageLength
	 */
	public void setStageLength(final String value)
	{
		setStageLength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace()
	{
		return getStageRace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final StageRace value)
	{
		setStageRace( getSession().getSessionContext(), value );
	}
	
}
