package me.geek.tom.DeathChanger;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathMessageChanger implements Listener {

    @EventHandler
    public void deathEvent(PlayerDeathEvent event) {

        EntityDamageEvent.DamageCause cause = event.getEntity().getLastDamageCause().getCause();

        if (cause.equals(EntityDamageEvent.DamageCause.FALL)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " fell. Splat.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.CONTACT)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " tried to eat a cactus. It hurt.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.CRAMMING)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " had too many friends. They were squashed to death.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.DRAGON_BREATH)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " needs a mint. They drank some dragon's breath.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.DROWNING)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " swam in water. Not a good idea if you can't breathe.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.FALLING_BLOCK)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " was squashed by a block. Splat.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.FIRE)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " played with matches and singed their eyebrows.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.FIRE_TICK)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " played with matches and singed their eyebrows.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.FLY_INTO_WALL)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " played with elytra and walls. Not a good idea.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.HOT_FLOOR)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " stood on some hot coals.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.LAVA)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " swam in lava. Not a good idea if you aren't a cool dude.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.LIGHTNING)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " encountered a shocking death.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.MAGIC)) {
            event.setDeathMessage(ChatColor.LIGHT_PURPLE + "You aren't a wizard " + ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + "!");
        } else if (cause.equals(EntityDamageEvent.DamageCause.POISON)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " drank some suspicious liquid. It was poison.");
        } else if  (cause.equals(EntityDamageEvent.DamageCause.PROJECTILE)) {
            // TODO: Work out what entity dealt the damage and adjust message accordingly
        } else if (cause.equals(EntityDamageEvent.DamageCause.STARVATION)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " didn't have enough food. \"please sir, can I have some more\"");
        } else if (cause.equals(EntityDamageEvent.DamageCause.SUFFOCATION)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " is now claustrophobic.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.SUICIDE)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " gave up on life.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.THORNS)) {
            // TODO: Add enemy thorns info
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " was stabbed by someone's armor.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.VOID)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " fell into the infinite nothingness.");
        } else if (cause.equals(EntityDamageEvent.DamageCause.WITHER)) {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " withered into nothingness.");
        } else {
            event.setDeathMessage(ChatColor.DARK_PURPLE + event.getEntity().getDisplayName() + ChatColor.LIGHT_PURPLE + " died for another reason.");
        }

    }

}
