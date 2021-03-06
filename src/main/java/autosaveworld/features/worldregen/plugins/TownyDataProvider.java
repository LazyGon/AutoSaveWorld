/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */

package autosaveworld.features.worldregen.plugins;

import org.bukkit.World;

import com.palmergames.bukkit.towny.TownyAPI;
import com.palmergames.bukkit.towny.exceptions.NotRegisteredException;
import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.TownBlock;

public class TownyDataProvider extends DataProvider {

	public TownyDataProvider(World world) throws Throwable {
		super(world);
	}

	@Override
	protected void init() throws NotRegisteredException {
		for (Town town : TownyAPI.getInstance().getDataSource().getWorld(world.getName()).getTowns().values()) {
			for (TownBlock tb : town.getTownBlocks()) {
				if (tb.getWorld().getName().equalsIgnoreCase(world.getName())) {
					addChunkAtCoord(tb.getX(), tb.getZ());
				}
			}
		}
	}

}
