package bskyblock.addin.challenges.database.object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import us.tastybento.bskyblock.database.objects.DataObject;

public class ChallengesDO extends DataObject {

    enum ChallengeType {
     /**
     * This challenge only shows and icon in the GUI and doesn't do anything.
     */
    ICON,
    /**
     * The player must have the items on them.
     */
    INVENTORY,
    /**
     * The island level has to be equal or over this amount. Only works if there's an island level plugin installed.
     */
    LEVEL,
    /**
     * Items or required entities have to be within x blocks of the player.
     */
    SURROUNDING
    }
    
    /**
     * Type of challenge
     */
    private ChallengeType challengeType;
    /**
     * Whether this challenge is deployed or not
     */
    private boolean deployed;
    /**
     * Description of the challenge. Will become the lore on the icon. Can include color codes.
     */
    private String description = "";
    /**
     * Experience point reward
     */
    private long expReward;
    /**
     * This challenge can be completed at any time
     */
    private boolean freeChallenge;
    /**
     * Name of the icon and challenge. May include color codes.
     */
    private String friendlyName = "";
    /**
     * The icon in the GUI for this challenge
     */
    private ItemStack icon = new ItemStack(Material.PAPER);
    /**
     * The challenge level, e.g. Novice, Expert, etc.
     * Levels are completed in order
     */
    private String level = "Novice";
    /**
     * Maximum number of times the challenge can be repeated
     */
    private long maxTimes = 1;
    /**
     * Money reward
     */
    private long moneyReward;
    /**
     * If true, the challenge will disappear from the GUI when completed
     */
    private boolean removeWhenCompleted;
    /**
     * True if the challenge is repeatable
     */
    private boolean repeatable;
    /**
     * Repeat exp award
     */
    private long repeatExpReward;
    /**
     * Reward items for repeating the challenge
     */
    private List<ItemStack> repeatItemReward = new ArrayList<>();
    /**
     * Repeat money award
     */
    private long repeatMoneyReward;
    /**
     * Commands to run when challenge is repeated
     */
    private List<String> repeatrewardcommands = new ArrayList<>();
    /**
     * Description of the repeat rewards. If blank, it will be autogenerated.
     */
    private String repeatRewardText = "";
    /**
     * Minimum amount of player experience
     */
    private long reqExp;
    /**
     * Require level for this challenge.
     */
    private long reqIslandlevel;
    /**
     * Minimum amount of money required
     */
    private long reqMoney;
    /**
     * The required permissions to see this challenge
     */
    private Set<String> reqPerms = new HashSet<>();
    /**
     * The items that must be in the inventory to complete the challenge.
     */
    private List<ItemStack> requiredItems = new ArrayList<>();
    /**
     * Commands to run when the player completes the challenge for the first time
     */
    private List<String> rewardCommands = new ArrayList<>();
    /**
     * List of items the player will receive first time
     */
    private List<ItemStack> rewardItems = new ArrayList<>();
    /**
     * If this is blank, the reward text will be auto-generated, otherwise this will be used.
     */
    private String rewardText = "";
    /**
     * The number of blocks around the player to search for items on an island
     */
    private int searchRadius = 10;
    /**
     * Inventory slot where this challenge should be placed. 0 to 49.
     */
    private int slot;   
    /**
     * Take the required items from the player
     */
    private boolean takeItems = true;
    /**
     * Take the money from the player
     */
    private boolean takeMoney = false;
    
    /**
     * Unique name of the challenge
     */
    private String uniqueId = "";

    public ChallengeType getChallengeType() {
        return challengeType;
    }

    public String getDescription() {
        return description;
    }

    public long getExpReward() {
        return expReward;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public ItemStack getIcon() {
        return icon;
    }

    public String getLevel() {
        return level;
    }

    public long getMaxTimes() {
        return maxTimes;
    }

    public long getMoneyReward() {
        return moneyReward;
    }

    public long getRepeatExpReward() {
        return repeatExpReward;
    }

    public List<ItemStack> getRepeatItemReward() {
        return repeatItemReward;
    }

    public long getRepeatMoneyReward() {
        return repeatMoneyReward;
    }

    public List<String> getRepeatrewardcommands() {
        return repeatrewardcommands;
    }

    public String getRepeatRewardText() {
        return repeatRewardText;
    }

    public long getReqExp() {
        return reqExp;
    }

    public long getReqIslandlevel() {
        return reqIslandlevel;
    }

    public long getReqMoney() {
        return reqMoney;
    }

    public Set<String> getReqPerms() {
        return reqPerms;
    }

    public List<ItemStack> getRequiredItems() {
        return requiredItems;
    }

    public List<String> getRewardCommands() {
        return rewardCommands;
    }

    public List<ItemStack> getRewardItems() {
        return rewardItems;
    }

    public String getRewardText() {
        return rewardText;
    }

    public int getSearchRadius() {
        return searchRadius;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    public boolean isDeployed() {
        return deployed;
    }

    public boolean isFreeChallenge() {
        return freeChallenge;
    }

    public boolean isRemoveWhenCompleted() {
        return removeWhenCompleted;
    }

    public boolean isRepeatable() {
        return repeatable;
    }

    public boolean isTakeItems() {
        return takeItems;
    }

    public boolean isTakeMoney() {
        return takeMoney;
    }

    public void setChallengeType(ChallengeType challengeType) {
        this.challengeType = challengeType;
    }

    public void setDeployed(boolean deployed) {
        this.deployed = deployed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExpReward(long expReward) {
        this.expReward = expReward;
    }

    public void setFreeChallenge(boolean freeChallenge) {
        this.freeChallenge = freeChallenge;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public void setIcon(ItemStack icon) {
        this.icon = icon;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setMaxTimes(long maxTimes) {
        this.maxTimes = maxTimes;
    }

    public void setMoneyReward(long moneyReward) {
        this.moneyReward = moneyReward;
    }

    public void setRemoveWhenCompleted(boolean removeWhenCompleted) {
        this.removeWhenCompleted = removeWhenCompleted;
    }

    public void setRepeatable(boolean repeatable) {
        this.repeatable = repeatable;
    }

    public void setRepeatExpReward(long repeatExpReward) {
        this.repeatExpReward = repeatExpReward;
    }

    public void setRepeatItemReward(List<ItemStack> repeatItemReward) {
        this.repeatItemReward = repeatItemReward;
    }

    public void setRepeatMoneyReward(long repeatMoneyReward) {
        this.repeatMoneyReward = repeatMoneyReward;
    }

    public void setRepeatrewardcommands(List<String> repeatrewardcommands) {
        this.repeatrewardcommands = repeatrewardcommands;
    }

    public void setRepeatRewardText(String repeatRewardText) {
        this.repeatRewardText = repeatRewardText;
    }

    public void setReqExp(long reqExp) {
        this.reqExp = reqExp;
    }

    public void setReqIslandlevel(long reqIslandlevel) {
        this.reqIslandlevel = reqIslandlevel;
    }

    public void setReqMoney(long reqMoney) {
        this.reqMoney = reqMoney;
    }

    public void setReqPerms(Set<String> reqPerms) {
        this.reqPerms = reqPerms;
    }

    public void setRequiredItems(List<ItemStack> requiredItems) {
        this.requiredItems = requiredItems;
    }

    public void setRewardCommands(List<String> rewardCommands) {
        this.rewardCommands = rewardCommands;
    }

    public void setRewardItems(List<ItemStack> rewardItems) {
        this.rewardItems = rewardItems;
    }

    public void setRewardText(String rewardText) {
        this.rewardText = rewardText;
    }

    public void setSearchRadius(int searchRadius) {
        this.searchRadius = searchRadius;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void setTakeItems(boolean takeItems) {
        this.takeItems = takeItems;
    }

    public void setTakeMoney(boolean takeMoney) {
        this.takeMoney = takeMoney;
    }

    @Override
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


}
