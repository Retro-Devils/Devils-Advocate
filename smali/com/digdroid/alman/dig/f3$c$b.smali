.class Lcom/digdroid/alman/dig/f3$c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3$c;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/f3$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$c$b;->b:Lcom/digdroid/alman/dig/f3$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$c$b;->b:Lcom/digdroid/alman/dig/f3$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f3$c;->d:Lcom/digdroid/alman/dig/f3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance v0, Lcom/digdroid/alman/dig/f3$c$b$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/f3$c$b$a;-><init>(Lcom/digdroid/alman/dig/f3$c$b;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    return-void
.end method
