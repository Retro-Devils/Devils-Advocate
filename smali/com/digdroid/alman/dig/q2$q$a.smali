.class Lcom/digdroid/alman/dig/q2$q$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2$q;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/q2$q;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2$q;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$q$a;->c:Lcom/digdroid/alman/dig/q2$q;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$q$a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$q$a;->c:Lcom/digdroid/alman/dig/q2$q;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$q;->b:Lcom/digdroid/alman/dig/d0;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q2$q$a;->b:Landroid/app/Activity;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/d0;->H(Landroid/app/Activity;)V

    return-void
.end method
