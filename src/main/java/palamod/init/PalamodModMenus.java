
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.world.inventory.XpbushpalahelpguienMenu;
import palamod.world.inventory.XpbushpalahelpguiMenu;
import palamod.world.inventory.WipguiMenu;
import palamod.world.inventory.VoidstoneminerconfigMenu;
import palamod.world.inventory.TrashguiMenu;
import palamod.world.inventory.TemporymarketMenu;
import palamod.world.inventory.StockhdvMenu;
import palamod.world.inventory.Stickgui7Menu;
import palamod.world.inventory.Stickgui6Menu;
import palamod.world.inventory.Stickgui5Menu;
import palamod.world.inventory.Stickgui4Menu;
import palamod.world.inventory.Stickgui3Menu;
import palamod.world.inventory.Stickgui2Menu;
import palamod.world.inventory.Stickgui1Menu;
import palamod.world.inventory.StatusdevnoteMenu;
import palamod.world.inventory.SpawnpanelMenu;
import palamod.world.inventory.SafeguiMenu;
import palamod.world.inventory.PhoneguiMenu;
import palamod.world.inventory.PalamachinepalahelpguiMenu;
import palamod.world.inventory.PalamachineguienMenu;
import palamod.world.inventory.PalamachineguiMenu;
import palamod.world.inventory.PalahelptreeenMenu;
import palamod.world.inventory.PalahelptreeMenu;
import palamod.world.inventory.PalahelporeenMenu;
import palamod.world.inventory.PalahelporeMenu;
import palamod.world.inventory.PalahelpnotsupportedMenu;
import palamod.world.inventory.PalahelpmachineMenu;
import palamod.world.inventory.Palahelpgui1Menu;
import palamod.world.inventory.PalahelpblockMenu;
import palamod.world.inventory.PalafurnaceguiMenu;
import palamod.world.inventory.PalaerrorMenu;
import palamod.world.inventory.Palaerror0006Menu;
import palamod.world.inventory.Palaerror0005Menu;
import palamod.world.inventory.Palaerror0004Menu;
import palamod.world.inventory.Palaerror0003Menu;
import palamod.world.inventory.Palaerror0001Menu;
import palamod.world.inventory.PaladumfurnaceMenu;
import palamod.world.inventory.NextPalahelpguiMenu;
import palamod.world.inventory.MoneypanelMenu;
import palamod.world.inventory.MegasafechestfirstsetupMenu;
import palamod.world.inventory.LuckyguiMenu;
import palamod.world.inventory.LegendarystonepalahelpMenu;
import palamod.world.inventory.LegendarystoneenMenu;
import palamod.world.inventory.LanguageselectionMenu;
import palamod.world.inventory.ItemmenupalahelpMenu;
import palamod.world.inventory.HdvsellguiMenu;
import palamod.world.inventory.HdvhelpMenu;
import palamod.world.inventory.Hdvguiv2Menu;
import palamod.world.inventory.HdvguiMenu;
import palamod.world.inventory.HdvconfguiMenu;
import palamod.world.inventory.GuardianguiMenu;
import palamod.world.inventory.GrinderpalahelpguiMenu;
import palamod.world.inventory.GrinderpalahelpenMenu;
import palamod.world.inventory.Grinderpalahelp2guiMenu;
import palamod.world.inventory.Grinderpalahelp2enMenu;
import palamod.world.inventory.GrinderguiMenu;
import palamod.world.inventory.GolemtreecMenu;
import palamod.world.inventory.ForgepalahelpguiMenu;
import palamod.world.inventory.ForgepalahelpenMenu;
import palamod.world.inventory.ForgeguiMenu;
import palamod.world.inventory.FluidpalahelpenMenu;
import palamod.world.inventory.FluidpalahelpMenu;
import palamod.world.inventory.FactionhomeguiMenu;
import palamod.world.inventory.FactioncreateguiMenu;
import palamod.world.inventory.CrusherpalahelpguienMenu;
import palamod.world.inventory.CrusherpalahelpguiMenu;
import palamod.world.inventory.CrusherguiMenu;
import palamod.world.inventory.AuthsafeguiMenu;
import palamod.world.inventory.AssembleurendMenu;
import palamod.world.inventory.AsemguiMenu;
import palamod.world.inventory.ArmorpalahelpguiMenu;
import palamod.world.inventory.AnalyserresultMenu;
import palamod.world.inventory.AnalyserloadingMenu;
import palamod.world.inventory.AlchemycreatorguiMenu;
import palamod.world.inventory.AdminshopmenuMenu;
import palamod.world.inventory.AdminshopdirtMenu;
import palamod.world.inventory.AdminshopblockMenu;
import palamod.world.inventory.AdminshopadbanMenu;
import palamod.world.inventory.AdminpanelmenuMenu;

import palamod.PalamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class PalamodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PalamodMod.MODID);
	public static final RegistryObject<MenuType<CrusherguiMenu>> CRUSHERGUI = REGISTRY.register("crushergui",
			() -> IForgeMenuType.create(CrusherguiMenu::new));
	public static final RegistryObject<MenuType<PalamachineguiMenu>> PALAMACHINEGUI = REGISTRY.register("palamachinegui",
			() -> IForgeMenuType.create(PalamachineguiMenu::new));
	public static final RegistryObject<MenuType<GrinderguiMenu>> GRINDERGUI = REGISTRY.register("grindergui",
			() -> IForgeMenuType.create(GrinderguiMenu::new));
	public static final RegistryObject<MenuType<AlchemycreatorguiMenu>> ALCHEMYCREATORGUI = REGISTRY.register("alchemycreatorgui",
			() -> IForgeMenuType.create(AlchemycreatorguiMenu::new));
	public static final RegistryObject<MenuType<Palahelpgui1Menu>> PALAHELPGUI_1 = REGISTRY.register("palahelpgui_1",
			() -> IForgeMenuType.create(Palahelpgui1Menu::new));
	public static final RegistryObject<MenuType<NextPalahelpguiMenu>> NEXT_PALAHELPGUI = REGISTRY.register("next_palahelpgui",
			() -> IForgeMenuType.create(NextPalahelpguiMenu::new));
	public static final RegistryObject<MenuType<AsemguiMenu>> ASEMGUI = REGISTRY.register("asemgui", () -> IForgeMenuType.create(AsemguiMenu::new));
	public static final RegistryObject<MenuType<PalahelpblockMenu>> PALAHELPBLOCK = REGISTRY.register("palahelpblock",
			() -> IForgeMenuType.create(PalahelpblockMenu::new));
	public static final RegistryObject<MenuType<ForgeguiMenu>> FORGEGUI = REGISTRY.register("forgegui",
			() -> IForgeMenuType.create(ForgeguiMenu::new));
	public static final RegistryObject<MenuType<PalahelporeMenu>> PALAHELPORE = REGISTRY.register("palahelpore",
			() -> IForgeMenuType.create(PalahelporeMenu::new));
	public static final RegistryObject<MenuType<PalahelptreeMenu>> PALAHELPTREE = REGISTRY.register("palahelptree",
			() -> IForgeMenuType.create(PalahelptreeMenu::new));
	public static final RegistryObject<MenuType<PalahelpmachineMenu>> PALAHELPMACHINE = REGISTRY.register("palahelpmachine",
			() -> IForgeMenuType.create(PalahelpmachineMenu::new));
	public static final RegistryObject<MenuType<GrinderpalahelpguiMenu>> GRINDERPALAHELPGUI = REGISTRY.register("grinderpalahelpgui",
			() -> IForgeMenuType.create(GrinderpalahelpguiMenu::new));
	public static final RegistryObject<MenuType<Grinderpalahelp2guiMenu>> GRINDERPALAHELP_2GUI = REGISTRY.register("grinderpalahelp_2gui",
			() -> IForgeMenuType.create(Grinderpalahelp2guiMenu::new));
	public static final RegistryObject<MenuType<PalamachinepalahelpguiMenu>> PALAMACHINEPALAHELPGUI = REGISTRY.register("palamachinepalahelpgui",
			() -> IForgeMenuType.create(PalamachinepalahelpguiMenu::new));
	public static final RegistryObject<MenuType<CrusherpalahelpguiMenu>> CRUSHERPALAHELPGUI = REGISTRY.register("crusherpalahelpgui",
			() -> IForgeMenuType.create(CrusherpalahelpguiMenu::new));
	public static final RegistryObject<MenuType<ForgepalahelpguiMenu>> FORGEPALAHELPGUI = REGISTRY.register("forgepalahelpgui",
			() -> IForgeMenuType.create(ForgepalahelpguiMenu::new));
	public static final RegistryObject<MenuType<FluidpalahelpMenu>> FLUIDPALAHELP = REGISTRY.register("fluidpalahelp",
			() -> IForgeMenuType.create(FluidpalahelpMenu::new));
	public static final RegistryObject<MenuType<ItemmenupalahelpMenu>> ITEMMENUPALAHELP = REGISTRY.register("itemmenupalahelp",
			() -> IForgeMenuType.create(ItemmenupalahelpMenu::new));
	public static final RegistryObject<MenuType<LegendarystonepalahelpMenu>> LEGENDARYSTONEPALAHELP = REGISTRY.register("legendarystonepalahelp",
			() -> IForgeMenuType.create(LegendarystonepalahelpMenu::new));
	public static final RegistryObject<MenuType<Stickgui1Menu>> STICKGUI_1 = REGISTRY.register("stickgui_1",
			() -> IForgeMenuType.create(Stickgui1Menu::new));
	public static final RegistryObject<MenuType<Stickgui2Menu>> STICKGUI_2 = REGISTRY.register("stickgui_2",
			() -> IForgeMenuType.create(Stickgui2Menu::new));
	public static final RegistryObject<MenuType<Stickgui3Menu>> STICKGUI_3 = REGISTRY.register("stickgui_3",
			() -> IForgeMenuType.create(Stickgui3Menu::new));
	public static final RegistryObject<MenuType<Stickgui4Menu>> STICKGUI_4 = REGISTRY.register("stickgui_4",
			() -> IForgeMenuType.create(Stickgui4Menu::new));
	public static final RegistryObject<MenuType<Stickgui5Menu>> STICKGUI_5 = REGISTRY.register("stickgui_5",
			() -> IForgeMenuType.create(Stickgui5Menu::new));
	public static final RegistryObject<MenuType<Stickgui6Menu>> STICKGUI_6 = REGISTRY.register("stickgui_6",
			() -> IForgeMenuType.create(Stickgui6Menu::new));
	public static final RegistryObject<MenuType<Stickgui7Menu>> STICKGUI_7 = REGISTRY.register("stickgui_7",
			() -> IForgeMenuType.create(Stickgui7Menu::new));
	public static final RegistryObject<MenuType<ArmorpalahelpguiMenu>> ARMORPALAHELPGUI = REGISTRY.register("armorpalahelpgui",
			() -> IForgeMenuType.create(ArmorpalahelpguiMenu::new));
	public static final RegistryObject<MenuType<XpbushpalahelpguiMenu>> XPBUSHPALAHELPGUI = REGISTRY.register("xpbushpalahelpgui",
			() -> IForgeMenuType.create(XpbushpalahelpguiMenu::new));
	public static final RegistryObject<MenuType<LuckyguiMenu>> LUCKYGUI = REGISTRY.register("luckygui",
			() -> IForgeMenuType.create(LuckyguiMenu::new));
	public static final RegistryObject<MenuType<PaladumfurnaceMenu>> PALADUMFURNACE = REGISTRY.register("paladumfurnace",
			() -> IForgeMenuType.create(PaladumfurnaceMenu::new));
	public static final RegistryObject<MenuType<SafeguiMenu>> SAFEGUI = REGISTRY.register("safegui", () -> IForgeMenuType.create(SafeguiMenu::new));
	public static final RegistryObject<MenuType<PhoneguiMenu>> PHONEGUI = REGISTRY.register("phonegui",
			() -> IForgeMenuType.create(PhoneguiMenu::new));
	public static final RegistryObject<MenuType<MegasafechestfirstsetupMenu>> MEGASAFECHESTFIRSTSETUP = REGISTRY.register("megasafechestfirstsetup",
			() -> IForgeMenuType.create(MegasafechestfirstsetupMenu::new));
	public static final RegistryObject<MenuType<AuthsafeguiMenu>> AUTHSAFEGUI = REGISTRY.register("authsafegui",
			() -> IForgeMenuType.create(AuthsafeguiMenu::new));
	public static final RegistryObject<MenuType<HdvguiMenu>> HDVGUI = REGISTRY.register("hdvgui", () -> IForgeMenuType.create(HdvguiMenu::new));
	public static final RegistryObject<MenuType<HdvhelpMenu>> HDVHELP = REGISTRY.register("hdvhelp", () -> IForgeMenuType.create(HdvhelpMenu::new));
	public static final RegistryObject<MenuType<HdvsellguiMenu>> HDVSELLGUI = REGISTRY.register("hdvsellgui",
			() -> IForgeMenuType.create(HdvsellguiMenu::new));
	public static final RegistryObject<MenuType<HdvconfguiMenu>> HDVCONFGUI = REGISTRY.register("hdvconfgui",
			() -> IForgeMenuType.create(HdvconfguiMenu::new));
	public static final RegistryObject<MenuType<WipguiMenu>> WIPGUI = REGISTRY.register("wipgui", () -> IForgeMenuType.create(WipguiMenu::new));
	public static final RegistryObject<MenuType<TemporymarketMenu>> TEMPORYMARKET = REGISTRY.register("temporymarket",
			() -> IForgeMenuType.create(TemporymarketMenu::new));
	public static final RegistryObject<MenuType<StatusdevnoteMenu>> STATUSDEVNOTE = REGISTRY.register("statusdevnote",
			() -> IForgeMenuType.create(StatusdevnoteMenu::new));
	public static final RegistryObject<MenuType<PalahelporeenMenu>> PALAHELPOREEN = REGISTRY.register("palahelporeen",
			() -> IForgeMenuType.create(PalahelporeenMenu::new));
	public static final RegistryObject<MenuType<PalahelptreeenMenu>> PALAHELPTREEEN = REGISTRY.register("palahelptreeen",
			() -> IForgeMenuType.create(PalahelptreeenMenu::new));
	public static final RegistryObject<MenuType<LanguageselectionMenu>> LANGUAGESELECTION = REGISTRY.register("languageselection",
			() -> IForgeMenuType.create(LanguageselectionMenu::new));
	public static final RegistryObject<MenuType<GrinderpalahelpenMenu>> GRINDERPALAHELPEN = REGISTRY.register("grinderpalahelpen",
			() -> IForgeMenuType.create(GrinderpalahelpenMenu::new));
	public static final RegistryObject<MenuType<PalahelpnotsupportedMenu>> PALAHELPNOTSUPPORTED = REGISTRY.register("palahelpnotsupported",
			() -> IForgeMenuType.create(PalahelpnotsupportedMenu::new));
	public static final RegistryObject<MenuType<Grinderpalahelp2enMenu>> GRINDERPALAHELP_2EN = REGISTRY.register("grinderpalahelp_2en",
			() -> IForgeMenuType.create(Grinderpalahelp2enMenu::new));
	public static final RegistryObject<MenuType<PalamachineguienMenu>> PALAMACHINEGUIEN = REGISTRY.register("palamachineguien",
			() -> IForgeMenuType.create(PalamachineguienMenu::new));
	public static final RegistryObject<MenuType<ForgepalahelpenMenu>> FORGEPALAHELPEN = REGISTRY.register("forgepalahelpen",
			() -> IForgeMenuType.create(ForgepalahelpenMenu::new));
	public static final RegistryObject<MenuType<FluidpalahelpenMenu>> FLUIDPALAHELPEN = REGISTRY.register("fluidpalahelpen",
			() -> IForgeMenuType.create(FluidpalahelpenMenu::new));
	public static final RegistryObject<MenuType<LegendarystoneenMenu>> LEGENDARYSTONEEN_PALAHELP = REGISTRY.register("legendarystoneen_palahelp",
			() -> IForgeMenuType.create(LegendarystoneenMenu::new));
	public static final RegistryObject<MenuType<XpbushpalahelpguienMenu>> XPBUSHPALAHELPGUIEN = REGISTRY.register("xpbushpalahelpguien",
			() -> IForgeMenuType.create(XpbushpalahelpguienMenu::new));
	public static final RegistryObject<MenuType<CrusherpalahelpguienMenu>> CRUSHERPALAHELPGUIEN = REGISTRY.register("crusherpalahelpguien",
			() -> IForgeMenuType.create(CrusherpalahelpguienMenu::new));
	public static final RegistryObject<MenuType<PalaerrorMenu>> PALAERROR0002 = REGISTRY.register("palaerror0002",
			() -> IForgeMenuType.create(PalaerrorMenu::new));
	public static final RegistryObject<MenuType<Palaerror0001Menu>> PALAERROR_0001 = REGISTRY.register("palaerror_0001",
			() -> IForgeMenuType.create(Palaerror0001Menu::new));
	public static final RegistryObject<MenuType<Palaerror0003Menu>> PALAERROR_0003 = REGISTRY.register("palaerror_0003",
			() -> IForgeMenuType.create(Palaerror0003Menu::new));
	public static final RegistryObject<MenuType<Palaerror0004Menu>> PALAERROR_0004 = REGISTRY.register("palaerror_0004",
			() -> IForgeMenuType.create(Palaerror0004Menu::new));
	public static final RegistryObject<MenuType<StockhdvMenu>> STOCKHDV = REGISTRY.register("stockhdv",
			() -> IForgeMenuType.create(StockhdvMenu::new));
	public static final RegistryObject<MenuType<AdminpanelmenuMenu>> ADMINPANELMENU = REGISTRY.register("adminpanelmenu",
			() -> IForgeMenuType.create(AdminpanelmenuMenu::new));
	public static final RegistryObject<MenuType<MoneypanelMenu>> MONEYPANEL = REGISTRY.register("moneypanel",
			() -> IForgeMenuType.create(MoneypanelMenu::new));
	public static final RegistryObject<MenuType<Palaerror0005Menu>> PALAERROR_0005 = REGISTRY.register("palaerror_0005",
			() -> IForgeMenuType.create(Palaerror0005Menu::new));
	public static final RegistryObject<MenuType<SpawnpanelMenu>> SPAWNPANEL = REGISTRY.register("spawnpanel",
			() -> IForgeMenuType.create(SpawnpanelMenu::new));
	public static final RegistryObject<MenuType<Palaerror0006Menu>> PALAERROR_0006 = REGISTRY.register("palaerror_0006",
			() -> IForgeMenuType.create(Palaerror0006Menu::new));
	public static final RegistryObject<MenuType<PalafurnaceguiMenu>> PALAFURNACEGUI = REGISTRY.register("palafurnacegui",
			() -> IForgeMenuType.create(PalafurnaceguiMenu::new));
	public static final RegistryObject<MenuType<TrashguiMenu>> TRASHGUI = REGISTRY.register("trashgui",
			() -> IForgeMenuType.create(TrashguiMenu::new));
	public static final RegistryObject<MenuType<AdminshopmenuMenu>> ADMINSHOPMENU = REGISTRY.register("adminshopmenu",
			() -> IForgeMenuType.create(AdminshopmenuMenu::new));
	public static final RegistryObject<MenuType<AdminshopblockMenu>> ADMINSHOPBLOCK = REGISTRY.register("adminshopblock",
			() -> IForgeMenuType.create(AdminshopblockMenu::new));
	public static final RegistryObject<MenuType<AdminshopdirtMenu>> ADMINSHOPDIRT = REGISTRY.register("adminshopdirt",
			() -> IForgeMenuType.create(AdminshopdirtMenu::new));
	public static final RegistryObject<MenuType<Hdvguiv2Menu>> HDVGUIV_2 = REGISTRY.register("hdvguiv_2",
			() -> IForgeMenuType.create(Hdvguiv2Menu::new));
	public static final RegistryObject<MenuType<VoidstoneminerconfigMenu>> VOIDSTONEMINERCONFIG = REGISTRY.register("voidstoneminerconfig",
			() -> IForgeMenuType.create(VoidstoneminerconfigMenu::new));
	public static final RegistryObject<MenuType<GuardianguiMenu>> GUARDIANGUI = REGISTRY.register("guardiangui",
			() -> IForgeMenuType.create(GuardianguiMenu::new));
	public static final RegistryObject<MenuType<GolemtreecMenu>> GOLEMTREEC = REGISTRY.register("golemtreec",
			() -> IForgeMenuType.create(GolemtreecMenu::new));
	public static final RegistryObject<MenuType<FactioncreateguiMenu>> FACTIONCREATEGUI = REGISTRY.register("factioncreategui",
			() -> IForgeMenuType.create(FactioncreateguiMenu::new));
	public static final RegistryObject<MenuType<FactionhomeguiMenu>> FACTIONHOMEGUI = REGISTRY.register("factionhomegui",
			() -> IForgeMenuType.create(FactionhomeguiMenu::new));
	public static final RegistryObject<MenuType<AdminshopadbanMenu>> ADMINSHOPADBAN = REGISTRY.register("adminshopadban",
			() -> IForgeMenuType.create(AdminshopadbanMenu::new));
	public static final RegistryObject<MenuType<AssembleurendMenu>> ASSEMBLEUREND = REGISTRY.register("assembleurend",
			() -> IForgeMenuType.create(AssembleurendMenu::new));
	public static final RegistryObject<MenuType<AnalyserloadingMenu>> ANALYSERLOADING = REGISTRY.register("analyserloading",
			() -> IForgeMenuType.create(AnalyserloadingMenu::new));
	public static final RegistryObject<MenuType<AnalyserresultMenu>> ANALYSERRESULT = REGISTRY.register("analyserresult",
			() -> IForgeMenuType.create(AnalyserresultMenu::new));
}
