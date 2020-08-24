package be.seeseemelk.mockbukkit.inventory;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class BarrelInventoryMock extends InventoryMock
{

	public BarrelInventoryMock(InventoryHolder holder, int size)
	{
		super(holder, size, InventoryType.BARREL);
	}

	@Override
	@NotNull
	public Inventory getSnapshot()
	{
		Inventory inventory = new BarrelInventoryMock(getHolder(), getSize());
		inventory.setContents(getContents());
		return inventory;
	}

}
