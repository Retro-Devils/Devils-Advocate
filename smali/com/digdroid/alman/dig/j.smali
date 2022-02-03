.class public Lcom/digdroid/alman/dig/j;
.super Lcom/digdroid/alman/dig/t0;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/t0;-><init>()V

    return-void
.end method


# virtual methods
.method B3()Landroid/database/Cursor;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/o0;->e(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/t0;->W0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    const-string v1, "collection"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-int p1, v1

    iput p1, v0, Lcom/digdroid/alman/dig/h0;->d:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->h0:Ljava/lang/String;

    iput-object v0, p1, Lcom/digdroid/alman/dig/h0;->m:Ljava/lang/String;

    return-void
.end method

.method x3()Ljava/lang/String;
    .locals 1

    const-string v0, "system"

    return-object v0
.end method

.method z3(Landroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
