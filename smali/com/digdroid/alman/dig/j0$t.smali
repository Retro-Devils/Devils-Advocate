.class Lcom/digdroid/alman/dig/j0$t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->o3(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$t;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    new-instance p1, Lcom/digdroid/alman/dig/v2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$t;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$t;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Lcom/digdroid/alman/dig/j0$t$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/j0$t$a;-><init>(Lcom/digdroid/alman/dig/j0$t;)V

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v3, v2}, Lcom/digdroid/alman/dig/v2;-><init>(Landroid/app/Activity;Landroid/database/sqlite/SQLiteDatabase;ZLcom/digdroid/alman/dig/v2$j;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$t;->b:Lcom/digdroid/alman/dig/j0;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/v2;->f(J)V

    return-void
.end method
