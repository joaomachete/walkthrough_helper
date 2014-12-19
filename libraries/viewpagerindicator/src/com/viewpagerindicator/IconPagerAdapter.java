/*
 * Copyright (c) 2014 SainsBurys Entertainment. Printed in Uk. All Rights Reserved. The copyright to the software program(s) is property of SainsBurys Entertainment. The program(s) may be used and or copied only with the express written consent of AloALo Ltd or in accordance with the terms and conditions stipulated in the agreement/contract under which the program(s) have been supplied.
 */

package com.viewpagerindicator;

public interface IconPagerAdapter {
    /**
     * Get icon representing the page at {@code index} in the adapter.
     */
    int getIconResId(int index);

    // From PagerAdapter
    int getCount();
}
