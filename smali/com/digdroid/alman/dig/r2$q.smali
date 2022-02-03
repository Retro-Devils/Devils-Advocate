.class Lcom/digdroid/alman/dig/r2$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->r3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/d0;

.field final synthetic c:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Lcom/digdroid/alman/dig/d0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$q;->c:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$q;->b:Lcom/digdroid/alman/dig/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$q;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$q;->c:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/d0;->j(Landroid/app/Activity;)V

    return-void
.end method
