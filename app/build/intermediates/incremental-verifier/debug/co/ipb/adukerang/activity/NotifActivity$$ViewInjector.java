// Generated code from Butter Knife. Do not modify!
package co.ipb.adukerang.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class NotifActivity$$ViewInjector<T extends co.ipb.adukerang.activity.NotifActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755251, "field 'iv_foto_keluhan'");
    target.iv_foto_keluhan = finder.castView(view, 2131755251, "field 'iv_foto_keluhan'");
    view = finder.findRequiredView(source, 2131755191, "field 'tvRuang'");
    target.tvRuang = finder.castView(view, 2131755191, "field 'tvRuang'");
    view = finder.findRequiredView(source, 2131755192, "field 'tvBarang'");
    target.tvBarang = finder.castView(view, 2131755192, "field 'tvBarang'");
    view = finder.findRequiredView(source, 2131755193, "field 'tvKeluhan'");
    target.tvKeluhan = finder.castView(view, 2131755193, "field 'tvKeluhan'");
    view = finder.findRequiredView(source, 2131755225, "field 'spStatus'");
    target.spStatus = finder.castView(view, 2131755225, "field 'spStatus'");
    view = finder.findRequiredView(source, 2131755195, "field 'bLapor'");
    target.bLapor = finder.castView(view, 2131755195, "field 'bLapor'");
    view = finder.findRequiredView(source, 2131755226, "field 'tvverify'");
    target.tvverify = finder.castView(view, 2131755226, "field 'tvverify'");
    view = finder.findRequiredView(source, 2131755196, "field 'bCancel'");
    target.bCancel = finder.castView(view, 2131755196, "field 'bCancel'");
    view = finder.findRequiredView(source, 2131755230, "field 'cVerify'");
    target.cVerify = finder.castView(view, 2131755230, "field 'cVerify'");
    view = finder.findRequiredView(source, 2131755227, "field 'temp_gcm'");
    target.temp_gcm = finder.castView(view, 2131755227, "field 'temp_gcm'");
    view = finder.findRequiredView(source, 2131755228, "field 'temp_uid'");
    target.temp_uid = finder.castView(view, 2131755228, "field 'temp_uid'");
    view = finder.findRequiredView(source, 2131755229, "field 'temp_id_keluhan'");
    target.temp_id_keluhan = finder.castView(view, 2131755229, "field 'temp_id_keluhan'");
  }

  @Override public void reset(T target) {
    target.iv_foto_keluhan = null;
    target.tvRuang = null;
    target.tvBarang = null;
    target.tvKeluhan = null;
    target.spStatus = null;
    target.bLapor = null;
    target.tvverify = null;
    target.bCancel = null;
    target.cVerify = null;
    target.temp_gcm = null;
    target.temp_uid = null;
    target.temp_id_keluhan = null;
  }
}
