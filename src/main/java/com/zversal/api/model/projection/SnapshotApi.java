package com.zversal.api.model.projection;


/**This interface is used to projecting out the required fields for Snapshot Api from {@link CompanyInfoModel}
 * @author bhupinder
 *
 */
public interface SnapshotApi {
SnapshotApiCZ2 getCz2();
SnapshotApiCZ3 getCz3();
SnapshotApiZK3 getZk3();
SnapshotApiCZ1 getCz1();
}
