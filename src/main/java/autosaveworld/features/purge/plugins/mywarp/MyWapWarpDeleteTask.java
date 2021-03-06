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

package autosaveworld.features.purge.plugins.mywarp;

import autosaveworld.features.purge.taskqueue.Task;

import io.github.mywarp.mywarp.warp.Warp;
import io.github.mywarp.mywarp.warp.WarpManager;

public class MyWapWarpDeleteTask implements Task {

	private WarpManager warpmanager;
	private Warp warp;

	public MyWapWarpDeleteTask(WarpManager warpManager, Warp warp) {
		this.warpmanager = warpManager;
		this.warp = warp;
	}

	@Override
	public boolean doNotQueue() {
		return false;
	}

	@Override
	public void performTask() {
		warpmanager.remove(warp);
	}

}
