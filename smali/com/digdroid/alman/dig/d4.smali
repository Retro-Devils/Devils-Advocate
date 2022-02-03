.class public Lcom/digdroid/alman/dig/d4;
.super Lcom/digdroid/alman/dig/t0;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/t0;-><init>()V

    return-void
.end method


# virtual methods
.method B3(Landroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method D3()Landroid/database/Cursor;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->E3()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/o0;->e(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/t0;->W0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "released"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {p1}, Ljava/util/Calendar;->clear()V

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Ljava/util/Calendar;->set(III)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    iput-wide v4, v3, Lcom/digdroid/alman/dig/h0;->a:J

    invoke-virtual {p1}, Ljava/util/Calendar;->clear()V

    add-int/2addr v1, v0

    invoke-virtual {p1, v1, v2, v0}, Ljava/util/Calendar;->set(III)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/digdroid/alman/dig/h0;->b:J

    return-void
.end method

.method z3()Ljava/lang/String;
    .locals 1

    const-string v0, "system"

    return-object v0
.end method
