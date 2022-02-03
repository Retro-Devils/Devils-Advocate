.class public Lcom/digdroid/alman/dig/c0;
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

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/h0;->e:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/o0;->e(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method x3()Ljava/lang/String;
    .locals 1

    const-string v0, "played"

    return-object v0
.end method

.method z3(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "favorite"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method
