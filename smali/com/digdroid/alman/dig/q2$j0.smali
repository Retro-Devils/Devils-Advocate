.class Lcom/digdroid/alman/dig/q2$j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->A3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$j0;->c:Lcom/digdroid/alman/dig/q2;

    iput p2, p0, Lcom/digdroid/alman/dig/q2$j0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q2$j0;->c:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance p2, Lcom/digdroid/alman/dig/q2$j0$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/q2$j0$a;-><init>(Lcom/digdroid/alman/dig/q2$j0;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    return-void
.end method
