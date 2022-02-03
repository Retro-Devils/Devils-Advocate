.class Lcom/digdroid/alman/dig/s$d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$d;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/s$d;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$d;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$d$a;->c:Lcom/digdroid/alman/dig/s$d;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s$d$a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$d$a;->b:Landroid/app/Activity;

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$d$a;->c:Lcom/digdroid/alman/dig/s$d;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s$d;->b:Lcom/digdroid/alman/dig/s;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/s3;

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/q3;->a(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;)V

    return-void
.end method
