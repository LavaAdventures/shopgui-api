package net.brcdev.shopgui.gui.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class ShopGui extends JavaPlugin{

   
    //Makes it so when you type /dirt it open the inventory
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       
        if (cmd.getName().equalsIgnoreCase("shop") && sender instanceof Player)
        {
       
           
            //Creates the inventory
            Player player = (Player) sender;
        Inventory gui = Bukkit.createInventory(null, 9,ChatColor.RED + "Shop Gui" );
   

        //This is where you create the item
        ItemStack survival = new ItemStack (Material.DIRT);
        ItemMeta survivalMeta = survival.getItemMeta();
       
       
        //This is where you set the display name of the item
        survival.setItemMeta(survivalMeta);
       
        //This is where you decide what slot the item goes into
        gui.setItem(0, survival);
        gui.setItem(1, survival);
        gui.setItem(2, survival);
        gui.setItem(3, survival);
        gui.setItem(4, survival);
        gui.setItem(5, survival);
        gui.setItem(6, survival);
        gui.setItem(6, survival);
        gui.setItem(7, survival);
        gui.setItem(8, survival);
       
        //This opens the inventory
        player.openInventory(gui);
   
        }
       
       
       
       
       
        return true;}}
